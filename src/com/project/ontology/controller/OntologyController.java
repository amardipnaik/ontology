package com.project.ontology.controller;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.project.ontology.bean.BookBean;
import com.project.ontology.bean.UserBean;
import com.project.ontology.service.IOntologyService;

@RestController
public class OntologyController {

	@Autowired
	IOntologyService ontologyService;
    
	 @RequestMapping(value="/login", method = RequestMethod.POST)
	    public ModelAndView loginMain(HttpServletRequest req, HttpServletResponse res)
	    {
		 
		 	HttpSession session=req.getSession();
	    	String login=req.getParameter("login");
	    	String password=req.getParameter("password");
	    	
	    	
	    	
	    	System.out.println("Login ::"+login);
	    	System.out.println("password ::"+password);
	    	
	    	boolean result=false;
	    	
			try {
				if(login.equalsIgnoreCase("admin")&&login.equalsIgnoreCase("admin"))
				{
					result=true;
				}
				else
				{
					result=false;
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	String profile=null;
	    	long userId=0;
	    	UserBean user=new UserBean();
	    	
	    	if(result=false)
	    	{
	    		return new ModelAndView("redirect:loginAuth");
	    		
	    	}
	    	
	    	
	    	session.setAttribute("userId",userId );
	    	session.setAttribute("user",user );
	    	
	    	session.setAttribute("profile",profile );
	    	
	    	
	    	session.setAttribute("loggedInUser", req.getAttribute("uname"));
	    	return new ModelAndView("login");
		
	    }
    
	 
	 @RequestMapping(value="/loginAuth", method = RequestMethod.GET)
	    public ModelAndView loginAuth(HttpServletRequest req, HttpServletResponse res)
	    {
		 	return new ModelAndView("loginAuth");
		
	    }
	 
	 
		@RequestMapping(value = "addBook", method = RequestMethod.POST)
		public Map<String,String> addBook(@RequestBody BookBean bookBean) {
			System.out.println("In Controller trasactionBean");
			Map<String,String> resultMap=new HashMap<String,String>();
			
			String status=null;
			
			try {
				ontologyService.addBook(bookBean);;
				status="SUCCESS";
			} catch (Exception e) {
				status="ERROR:Kindly Check With Database Connectin";
				
			}
			
			resultMap.put("result", status);
			return resultMap;
			
		}
		
		@RequestMapping(value = "bookList", method = RequestMethod.POST)
		public List<BookBean> bookList(@RequestBody BookBean bookBean) {
			System.out.println("In Controller feedbackList");
			
			List<BookBean> bookList=new ArrayList<>();
			bookList=ontologyService.bookListByReport(bookBean);
			
			return bookList;
		}
		
	 
	

	
	
}
