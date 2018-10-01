package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.repositories.PostRepository;
import com.greenfoxacademy.reddit.models.Post;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService{

    PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public Iterable<Post> findAll() {
        List<Post> sortedPosts = Streamable.of(postRepository.findAll()).stream()
                .sorted(Comparator.comparingInt(post -> post.getRateing() * (-1)))
                .collect(Collectors.toList());

        return sortedPosts;
    }

    @Override
    public void addPost(String name, String url) {
            postRepository.save(new Post(name, url));
    }

    @Override
    public void upVote(Long id) {
        Post post = postRepository.findById(id).orElseThrow(IllegalAccessError::new);
        post.setRateing(post.getRateing() + 1);
        postRepository.save(post);
    }

    @Override
    public void downVote(Long id) {
        Post post = postRepository.findById(id).orElseThrow(IllegalAccessError::new);
        post.setRateing(post.getRateing() - 1);
        postRepository.save(post);
    }

    public void delete(Long id) {
        postRepository.deleteById(id);
    }
}
