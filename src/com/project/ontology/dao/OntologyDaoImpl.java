package com.project.ontology.dao;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.project.ontology.bean.BookBean;

@Repository
public class OntologyDaoImpl implements IOntologyDao{

	


private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	public void addBook(BookBean book) {
		
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(book);
		System.out.println("book saved successfully, book Details="+book);
		
	}
    
 public List<BookBean> bookListByReport(BookBean book) {
  		Session session = this.sessionFactory.getCurrentSession();
  		
  	
  		
  		
  		StringBuilder querryBuilder=new StringBuilder();
  		querryBuilder.append("SELECT bk.* FROM book bk  ");
  		
  		
  		if(null!=book.getBookId() &&""!=book.getBookId())
		{
  			querryBuilder.append("WHERE bk.bookid =:bookid  ");
		}
  		if(null!=book.getBookName() &&""!=book.getBookName())
		{
  			querryBuilder.append("WHERE bk.name =:bookName ");
		}
  		if(null!=book.getBookAuthor() &&""!=book.getBookAuthor())
		{
  			querryBuilder.append("WHERE bk.author =:bookAuthor ");
		}
  		
  	
  		
  		SQLQuery query
  		 = session.createSQLQuery(querryBuilder.toString()).addEntity(BookBean.class);
  		
  		if(null!=book.getBookId() &&""!=book.getBookId())
		{
  			query.setParameter("bookid",book.getBookId());
		}
  		if(null!=book.getBookName() &&""!=book.getBookName())
		{
  			query.setParameter("bookName",book.getBookName());
		}
  		if(null!=book.getBookAuthor() &&""!=book.getBookAuthor())
		{
  			query.setParameter("bookAuthor",book.getBookAuthor());
		}
  		
  		List<BookBean> bookList=query.list();
  		System.out.println("TrasactionBean List Is :: "+bookList);
         return bookList;
  		
  	}


    
    
    
    

}
