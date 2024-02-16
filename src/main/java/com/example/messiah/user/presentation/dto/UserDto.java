package com.example.messiah.user.presentation.dto;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

public class UserDto {

    @Getter
    @Builder
    public static class SignUserInfo {
        private String userId;
        private String userPassword;
        private String nickName;
    }
}
