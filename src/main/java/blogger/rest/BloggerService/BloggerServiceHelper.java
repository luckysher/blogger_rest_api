package blogger.rest.BloggerService;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import blogger.rest.BloggerService.*;
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
}
