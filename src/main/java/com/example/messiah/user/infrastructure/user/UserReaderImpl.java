package com.example.messiah.user.infrastructure.user;

import com.example.messiah.user.domain.user.UserReader;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class UserReaderImpl implements UserReader {
    private final UserJpaRepository userJpaRepository;

    @Override
    public String getDuplicateUserId(String userId) {
        return userJpaRepository.findByUserId(userId);
    }
}
