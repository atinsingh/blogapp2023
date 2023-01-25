package com.example.jpademo.service;

import com.example.jpademo.entity.Blog;
import com.example.jpademo.repo.BlogRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogService {
    private BlogRepo repo;


    public BlogService(BlogRepo repo) {
        this.repo = repo;
    }

    public Blog createBlog(Blog blog){
        // Any validatiom
        return repo.save(blog);
    }

    public Blog updateBlog(Blog blog) {
        // YOu may to custom check here
        return repo.save(blog);
    }

    public List<Blog> getMeAll() {
        return repo.findAll();
    }
    public Optional<Blog> getById(Long id) {
        return repo.findById(id);
    }

    public void deleteByid(Long id){
        repo.deleteById(id);
    }
}
