package blogger.rest.BloggerService;

import java.text.SimpleDateFormat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import blogger.rest.BloggerService.*;
import blogger.rest.controller.BloggerRestController;

import org.springframework.orm.hibernate3.HibernateTemplate;


public class BloggerServiceHelper {
	public BeanFactory beanfactory ;
	 
	public BloggerServiceHelper(){
		System.out.println("initializing Blogger helper");
		String contextFilePath = "/applicationContext1.xml";		
		Resource r = new ClassPathResource(contextFilePath);
		this.beanfactory = new XmlBeanFactory(r);		
	}
	
	public BloggerServiceImpl getBloggerServiceImpl(String bloggerBeanName){
		BloggerServiceImpl dao = null;	
		dao = (BloggerServiceImpl) this.beanfactory.getBean("d");
		return dao;
	}

	public HibernateTemplate getTemplate(){
		HibernateTemplate hibernateTemplate = null;		
		hibernateTemplate = (HibernateTemplate) beanfactory.getBean("template");
		return hibernateTemplate;
	}
	// get date from string
	public static Date parseDate(String dateString){
		Date date = null;
		try{
			date = new SimpleDateFormat("yyyy/MM/dd").parse(dateString);
			System.out.println("Date: " + date);
			return date;
		}catch(Exception e){			
			
		}
		return date;
	}
}
