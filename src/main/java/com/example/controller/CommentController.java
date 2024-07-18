package com.example.controller;


import com.example.entity.Comment;
import com.example.service.CommentService;
import com.example.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/comments")
public class CommentController {

    private CommentService commentService;

    private PostService postService;

    public CommentController(CommentService commentService, PostService postService) {
        this.commentService = commentService;
        this.postService = postService;
    }

//    http://localhost:8080/api/v1/comments
    @PostMapping
    public ResponseEntity<Comment> createComment(
            @RequestBody Comment comment,
            @RequestParam long postId
    ){
        Comment cmnt = postService.createComment(comment, postId);
        return new ResponseEntity<>(cmnt,HttpStatus.OK);
    }


}
