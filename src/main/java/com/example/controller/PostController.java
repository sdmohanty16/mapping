package com.example.controller;


import com.example.entity.Post;
import com.example.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/posts")
public class PostController {

    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    //http://localhost:8080/api/v1/posts/create
    @PostMapping("/create")
    public ResponseEntity<Post> createPost(@RequestBody Post post){
        Post po = postService.createPost(post);
        return new ResponseEntity<>(po, HttpStatus.CREATED);
    }
}
