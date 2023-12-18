package com.raccoon.repository;

import com.raccoon.Entity.Post;
import com.raccoon.Entity.PostInfoMapping;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    // Method 뒤에 By는 항상 들어가야한다. By 자체가 의미가 있음.
    List<PostInfoMapping> findAllPostBy();
}
