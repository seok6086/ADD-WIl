package com.example.messiah.user.infrastructure.user;

import com.example.messiah.user.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserJpaRepository extends JpaRepository<User, Long> {

    String findByUserId(String userId);
}
