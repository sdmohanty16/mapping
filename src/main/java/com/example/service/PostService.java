package com.example.service;

import com.example.entity.Comment;
import com.example.entity.Post;

public interface PostService {


    Post createPost(Post post);


    Comment createComment(Comment comment, long postId);
}
