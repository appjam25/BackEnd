package com.backend.backend_java.user.repository;

import com.backend.backend_java.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
    User findByNickname(String nickname);
}
