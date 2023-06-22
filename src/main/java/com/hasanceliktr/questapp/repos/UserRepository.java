package com.hasanceliktr.questapp.repos;

import com.hasanceliktr.questapp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
