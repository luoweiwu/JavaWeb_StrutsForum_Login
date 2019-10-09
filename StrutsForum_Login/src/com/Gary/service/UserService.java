package com.Gary.service;

import java.sql.SQLException;

import com.Gary.dao.UserDao;
import com.Gary.domain.User;

public class UserService {

	public boolean findUser(User user) throws SQLException {
		UserDao userDao = new UserDao();
		User temp = userDao.findUser(user);
		return temp ==null?false:true;
	}

}
