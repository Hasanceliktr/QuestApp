package com.hasanceliktr.questapp.repos;

import com.hasanceliktr.questapp.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Long> {
}
