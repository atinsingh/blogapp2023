package com.example.jpademo;

import com.example.jpademo.entity.Blog;
import com.example.jpademo.entity.Category;
import com.example.jpademo.service.BlogService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.Instant;

@SpringBootApplication
public class JpaDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(JpaDemoApplication.class, args);
        BlogService blogService = context.getBean(BlogService.class);
        Blog blog = new Blog();
        blog.setTitle("Lerning Java");
        blog.setBlogText("Learning lambadas and spring good be confusing");
        Category category = new Category();
        category.setName("Programing");
        category.setCreateDate(Instant.now());
        category.setUpdateDate(Instant.now());
        blog.setCategory(category);
        blog.setCreateDate(Instant.now());
        blogService.createBlog(blog);
    }

}
