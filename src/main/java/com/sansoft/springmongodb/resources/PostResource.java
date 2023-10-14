package com.sansoft.springmongodb.resources;


import com.sansoft.springmongodb.domain.Post;
import com.sansoft.springmongodb.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/posts")
public class PostResource {

    @Autowired
    private PostService service;
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Post> findById(@PathVariable String id) {
        return ResponseEntity.ok().body(service.findById(id));
    }
}
