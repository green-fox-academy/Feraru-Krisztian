package com.greenfoxacademy.reddit;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.repositories.PostRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditApplication implements CommandLineRunner {

    PostRepository postRepository;

    public RedditApplication(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(RedditApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        postRepository.save(new Post("My band: Servet zenekar", "https://www.facebook.com/servetband/?eid=ARBgVZWHkef2U2BbEoI6zhImEpZX5Lstg6LUQBEHTWK6DVKzNldxB55mufjCXTE-gHvhf2fS5q4K37h3", 1));
        postRepository.save(new Post("My band: Servet zenekar", "https://www.facebook.com/servetband/?eid=ARBgVZWHkef2U2BbEoI6zhImEpZX5Lstg6LUQBEHTWK6DVKzNldxB55mufjCXTE-gHvhf2fS5q4K37h3", 21));
        postRepository.save(new Post("My band: Servet zenekar", "https://www.facebook.com/servetband/?eid=ARBgVZWHkef2U2BbEoI6zhImEpZX5Lstg6LUQBEHTWK6DVKzNldxB55mufjCXTE-gHvhf2fS5q4K37h3", 13));
        postRepository.save(new Post("My band: Servet zenekar", "https://www.facebook.com/servetband/?eid=ARBgVZWHkef2U2BbEoI6zhImEpZX5Lstg6LUQBEHTWK6DVKzNldxB55mufjCXTE-gHvhf2fS5q4K37h3", 54));
        postRepository.save(new Post("My band: Servet zenekar", "https://www.facebook.com/servetband/?eid=ARBgVZWHkef2U2BbEoI6zhImEpZX5Lstg6LUQBEHTWK6DVKzNldxB55mufjCXTE-gHvhf2fS5q4K37h3", 3));
        postRepository.save(new Post("My band: Servet zenekar", "https://www.facebook.com/servetband/?eid=ARBgVZWHkef2U2BbEoI6zhImEpZX5Lstg6LUQBEHTWK6DVKzNldxB55mufjCXTE-gHvhf2fS5q4K37h3", 7));
    }
}
