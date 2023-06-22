package com.hasanceliktr.questapp.repos;

import com.hasanceliktr.questapp.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {
}
