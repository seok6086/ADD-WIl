package com.example.messiah.user.domain.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

public class UserCommand {

    @Getter
    @Builder
    @AllArgsConstructor
    public static class SignUser {
        private String userId;
        private String userPassword;
        private String nickName;

        public User toEntity(String userId, String userPassword, String nickName) {
            return User.builder()
                    .userId(userId)
                    .userPassword(userPassword)
                    .nickName(nickName)
                    .insrDt(LocalDate.now())
                    .useYn("Y")
                    .build();
        }
    }

}
