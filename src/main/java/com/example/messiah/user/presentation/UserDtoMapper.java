package com.example.messiah.user.presentation;

import com.example.messiah.user.domain.user.UserCommand;
import com.example.messiah.user.presentation.dto.UserDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(
        componentModel = "spring",
        injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        unmappedTargetPolicy = ReportingPolicy.ERROR
)
public interface UserDtoMapper {
    UserCommand.SignUser of(UserDto.SignUserInfo user);
}
