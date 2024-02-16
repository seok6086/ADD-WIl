package com.example.messiah.user.application;

import com.example.messiah.user.domain.user.UserCommand;
import com.example.messiah.user.domain.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserFacade {
    private final UserService userService;
    public void signUser(UserCommand.SignUser userInfo) {
        userService.signUser(userInfo);
    }
}
