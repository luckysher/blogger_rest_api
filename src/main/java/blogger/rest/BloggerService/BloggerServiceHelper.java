package blogger.rest.BloggerService;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import blogger.rest.BloggerService.*;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class BloggerServiceHelper {
	public BloggerServiceHelper(){
		System.out.println("initializing Blogger helper");
	}
	
	public BloggerServiceImpl getBloggerServiceImpl(String bloggerBeanName){
		BloggerServiceImpl dao = null;	
		String contextFilePath = "/applicationContext.xml";		
		Resource r = new ClassPathResource(contextFilePath);
		BeanFactory beanfactory = new XmlBeanFactory(r);
		dao = (BloggerServiceImpl) beanfactory.getBean("d");
		return dao;
	}
}
