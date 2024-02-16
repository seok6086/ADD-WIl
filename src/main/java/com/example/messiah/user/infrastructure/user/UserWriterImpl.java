package com.example.messiah.user.infrastructure.user;

import com.example.messiah.user.domain.user.User;
import com.example.messiah.user.domain.user.UserWriter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserWriterImpl implements UserWriter {
    private final UserJpaRepository userJpaRepository;
    @Override
    public void signUser(User signUser) {
        userJpaRepository.save(signUser);
    }
}
