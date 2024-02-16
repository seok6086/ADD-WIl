package com.example.messiah.user.presentation;

import com.example.messiah.user.application.UserFacade;
import com.example.messiah.user.domain.user.UserCommand;
import com.example.messiah.user.presentation.dto.UserDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api/user")
@RestController
@Slf4j
public class UserController {
    private final UserFacade userFacade;
    private final UserDtoMapper userDtoMapper;

    @PostMapping("/sign")
    public void signUser(
            @RequestBody UserDto.SignUserInfo user
    ) {
        UserCommand.SignUser userInfo = userDtoMapper.of(user);
        userFacade.signUser(userInfo);
    }
}
