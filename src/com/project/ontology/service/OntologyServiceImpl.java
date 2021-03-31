package com.project.ontology.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.ontology.bean.BookBean;
import com.project.ontology.dao.IOntologyDao;

@Service
public class OntologyServiceImpl implements IOntologyService{
	
	private  IOntologyDao ontologyDao;

	public IOntologyDao getOntologyDao() {
		return ontologyDao;
	}
	public void setOntologyDao(IOntologyDao ontologyDao) {
		this.ontologyDao = ontologyDao;
	}


@Transactional
     public void addBook(BookBean book)
	{
	ontologyDao.addBook(book);
		
	}
@Transactional
public List<BookBean> bookListByReport(BookBean book)
	 {
		return ontologyDao.bookListByReport(book);
	 }




}
