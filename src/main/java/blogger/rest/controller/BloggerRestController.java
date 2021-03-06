package blogger.rest.controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import blogger.rest.BloggerService.BloggerServiceHelper;
import blogger.rest.BloggerService.BloggerServiceImpl;
import blogger.rest.models.*;

import org.json.simple.*;

@RestController
@RequestMapping("/blog")
public class BloggerRestController {
	
	//@Autowired
	private BloggerServiceImpl bloggerService;
	
    private Logger logger ;
    
    public BloggerRestController(){
    	this.logger = LoggerFactory.getLogger(BloggerRestController.class);
    	this.bloggerService = new BloggerServiceImpl();
    	this.bloggerService.setHibernateTemplate(new BloggerServiceHelper().getTemplate());
    }
    
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Blog getBlog(@PathVariable("id") int id) {    	
        return bloggerService.getBlog(id);
    }

    @RequestMapping(value = "/add",  method = RequestMethod.POST)
    public Blog addBlog(@RequestBody Blog blog)
    {
    	this.bloggerService.addBlog(blog);
    	return blog;        
   }
    @RequestMapping(value = "/all",  method = RequestMethod.GET)
    public List<Blog> getBlogList()
    {
    	List<Blog> blogs =  this.bloggerService.getBlogList();
    	return blogs;        
   }
}
