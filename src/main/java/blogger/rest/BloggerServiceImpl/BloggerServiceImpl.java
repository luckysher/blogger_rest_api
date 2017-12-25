package blogger.rest.BloggerServiceImpl;

import blogger.rest.BloggerService.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;


@Component
public class BloggerServiceImpl implements BloggerService{

    private static Logger logger= LoggerFactory.getLogger(BloggerServiceImpl.class);
    private AtomicInteger atomicInteger=new AtomicInteger(0);

    public BloggerServiceImpl()
    {
        init();
    }

   
}


