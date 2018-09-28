package com.greenfoxacademy.reddit.services;


import com.greenfoxacademy.reddit.models.Post;

public interface PostService {
    Iterable<Post> findAll();

    void addPost(String name, String url);

    void upVote(Long id);

    void downVote(Long id);

    void delete(Long id);
}
