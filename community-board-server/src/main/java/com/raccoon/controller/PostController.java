package com.raccoon.controller;


import com.raccoon.Entity.Post;
import com.raccoon.Entity.PostInfoMapping;
import com.raccoon.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
public class PostController {

    @Autowired
    private PostRepository postRepository;

    @GetMapping("/api/posts")
    public ResponseEntity<List<PostInfoMapping>> getAllPost() {
        return new ResponseEntity(postRepository.findAllPostBy(), HttpStatus.OK);
    }

    @org.springframework.web.bind.annotation.PostMapping("/api/post/create")
    public ResponseEntity<Post> registPost(@RequestBody Post post) {
        postRepository.save(post);
        return new ResponseEntity(post, HttpStatus.OK);
    }

    @GetMapping("/api/post/{id}")
    public ResponseEntity<Post> getPost(@PathVariable(name = "id") Long id) {
        Optional<Post> dest = postRepository.findById(id);
        if (dest.isPresent()) {
            Post post = dest.get();
            return new ResponseEntity<>(post, HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/api/post/{id}")
    public ResponseEntity<Post> deletePost(@PathVariable(name = "id") Long id) {
        if (postRepository.existsById(id)) {
            postRepository.deleteById(id);
            return new ResponseEntity<>(null, HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
    }

    @PatchMapping("/api/post/{id}")
    public ResponseEntity<Post> modifyPost(@PathVariable(name = "id") Long id, @RequestBody Post post) {
        Optional<Post> dest = postRepository.findById(id);
        if (dest.isPresent()) {
            dest.get().copyFrom(post);
            postRepository.save(dest.get());
            return new ResponseEntity<>(post, HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
    }
}
