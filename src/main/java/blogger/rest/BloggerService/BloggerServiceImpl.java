package blogger.rest.BloggerService;

import blogger.rest.models.Blog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;


@Component
// Class for implementing Blogger service 
public class BloggerServiceImpl implements BloggerService{

    private static Logger logger= null;
    public HibernateTemplate template;
    public static AtomicInteger aInt;
    
	
	// get date from string
	public static Date parseDate(String dateString){
		Date date = null;
		try{
			date = new SimpleDateFormat("yyyy/MM/dd").parse(dateString);
			System.out.println("Date: " + date);
			return date;
		}catch(Exception e){			
			logger.debug(String.format("[%s] Got exception: '%s' while formatting date: '%s'","BloggerRestApi", e, dateString));
			e.printStackTrace();
		}
		return date;
	}
	
    // consturctor for blogger service impl
    public BloggerServiceImpl(){
    	this.aInt = new AtomicInteger(1); 
    	this.logger =  LoggerFactory.getLogger(BloggerServiceImpl.class);
    }
    
    // method for setting hibernate template
    public void setHibernateTemplate(HibernateTemplate template){
    	this.template = template;
    }
    
    // method for returning BloggerServiceImpl
    private BloggerServiceImpl getBookService()
    {
    	logger.debug("Getting bloger service..");
    	return this;
    }
    // get blog list 
    public List<Blog> getBlogList() {
           List<Blog> blogList = new ArrayList<Blog>();
           blogList = this.template.loadAll(Blog.class);
           return blogList;
    }
    
    public Blog getBlog(int id) {
       Blog blog = this.template.get(Blog.class, id);
        if (blog != null){
        		return blog;
         }        
        return null;
    }

    public long addBlog(Blog blog)
    {
        int idToSet = aInt.getAndIncrement();
        blog.setId(idToSet);
        this.template.save(blog);
        logger.debug("Adding blog with id: " + idToSet);
        return idToSet;
    }
}


