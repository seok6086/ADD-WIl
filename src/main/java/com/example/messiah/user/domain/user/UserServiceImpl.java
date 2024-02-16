package com.example.messiah.user.domain.user;

import io.netty.util.internal.StringUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.security.InvalidParameterException;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserWriter userWriter;
    private final UserReader userReader;
    @Override
    @Transactional
    public void signUser(UserCommand.SignUser userInfo) {
        String duplicateUserId = userReader.getDuplicateUserId(userInfo.getUserId());
        if(StringUtils.hasText(duplicateUserId)){
            throw new InvalidParameterException("중복된 아이디 입니다.");
        }
        // TODO: 2024/02/16 보안 로직 및 주요 로직 추가
        userWriter.signUser(userInfo.toEntity(userInfo.getUserId(),userInfo.getUserPassword(),userInfo.getNickName()));

    }
}
