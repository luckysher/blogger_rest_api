package blogger.rest.BloggerService;

import java.util.List;

import blogger.rest.models.Blog;

// service for implementing blogs
public interface BloggerService {
    public Blog getBlog(int id);

    public long addBlog(Blog blog);

    public List<Blog> getBlogList();
}
