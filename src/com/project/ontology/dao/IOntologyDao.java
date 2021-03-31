package com.project.ontology.dao;

import java.util.List;

import com.project.ontology.bean.BookBean;

public interface IOntologyDao {
	
	
	 public void addBook(BookBean book);
	 
	 public List<BookBean> bookListByReport(BookBean book);
	 
	
	

}
