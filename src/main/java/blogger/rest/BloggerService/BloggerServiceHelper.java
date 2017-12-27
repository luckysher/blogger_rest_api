package blogger.rest.BloggerService;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import blogger.rest.BloggerService.*;

public class BloggerServiceHelper {
	public BloggerServiceHelper(){
		System.out.println("initializing Blogger helper");
	}
	
	public BloggerServiceImpl getBloggerServiceImpl(String bloggerBeanName){
		BloggerServiceImpl dao = null;	
		
		return dao;
	}
}
