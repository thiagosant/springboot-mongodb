package com.sansoft.springmongodb.repository;

import com.sansoft.springmongodb.domain.Post;
import com.sansoft.springmongodb.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

    List<Post> findByTitleContainingIgnoreCase(String text);
}
