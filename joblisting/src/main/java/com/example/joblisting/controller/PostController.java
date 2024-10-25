package com.example.joblisting.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.joblisting.PostRepository;
import com.example.joblisting.model.Post;

import jakarta.servlet.http.HttpServlet;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class PostController {
    @Autowired
    PostRepository repo;

    
    @RequestMapping(value = "/")
   public void redirect( HttpServlet response) throws IOException {
       ((Object) response).sendRedirect("/swagger-ui.html");
   }
   @GetMapping("/posts")
    public List<Post> getaAllPosts(){
        return repo.findAll();
    }
}
