package com.lucumi.backend.mappers;

import com.lucumi.backend.dto.SignUpDto;
import com.lucumi.backend.dto.UserDto;
import com.lucumi.backend.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toUserDto(User user);

    @Mapping(target = "password", ignore = true) //ignore char[] in signUpDto and string in User object
    User signUpToUser(SignUpDto signUpDto);
}
