package com.web;

import com.Bean.Blog;
import com.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PoxyBlogController {

    @Autowired
    private BlogService blogService;

    @RequestMapping("/proxy/blog/{title}")
    public Blog findByTitle(@PathVariable("title") String title){
        return new Blog();
    }





}
