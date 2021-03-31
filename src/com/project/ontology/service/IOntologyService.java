package com.project.ontology.service;

import java.util.List;

import com.project.ontology.bean.BookBean;

public interface IOntologyService {
	
	
 public void addBook(BookBean book);
	 
	 public List<BookBean> bookListByReport(BookBean book);

}
