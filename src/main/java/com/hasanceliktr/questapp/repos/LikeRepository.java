package com.hasanceliktr.questapp.repos;

import com.hasanceliktr.questapp.entities.Like;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeRepository extends JpaRepository<Like,Long> {
}
