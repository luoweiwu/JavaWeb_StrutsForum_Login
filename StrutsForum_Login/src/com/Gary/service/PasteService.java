package com.Gary.service;


import java.sql.SQLException;
import java.util.List;

import com.Gary.dao.PasteDao;
import com.Gary.domain.Paste;


public class PasteService {

	public List<Paste> findAllPaste() throws SQLException {
		PasteDao pasteDao = new PasteDao();
		return pasteDao.findAllPaste();

	}

	
	
}
