package com.Gary.web;

import org.apache.struts2.ServletActionContext;

import com.Gary.domain.User;
import com.Gary.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<User>{

    public User user = new User();
    
    
    
    public String login() throws Exception {
        
        System.out.println("login()方法");
        System.out.println(user.getUsername()+":"+user.getPassword());
        
        System.out.println("session域..."+ActionContext.getContext().getSession().get("mysession"));
        System.out.println("application域..."+ActionContext.getContext().getApplication().get("myapplication"));
        
        
        UserService userService = new UserService();
        boolean success = userService.findUser(user);
        
        if(success)
        {
        	ActionContext.getContext().getSession().put("user", user);
            return "success";
        }else{
            ServletActionContext.getRequest().setAttribute("error", "用户名或密码错误！！！");
            return "error";
        }
            
    }
    
    //注册
    public String register() throws Exception {
        
        System.err.println("register()方法");
        
        return null;
    }

    //kill方法
    public String kill() throws Exception {
        
        System.err.println("kill()方法");
        
        return null;
    }
    
    @Override
    public User getModel() {
        // TODO Auto-generated method stub
        return user;
    }
}
