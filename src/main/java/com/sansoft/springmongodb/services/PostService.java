package com.sansoft.springmongodb.services;

import com.sansoft.springmongodb.domain.Post;
import com.sansoft.springmongodb.repository.PostRepository;
import com.sansoft.springmongodb.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository repository;
    public Post findById(String id) {
        return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Object not found!"));
    }

    public List<Post> findByTitle(String text) {
        return repository.findByTitleContainingIgnoreCase(text);
    }

}
