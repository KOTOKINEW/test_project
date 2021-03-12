package com.kotoki.stud.test_project.user;

import com.kotoki.stud.test_project.dto.UserDto;
import com.kotoki.stud.test_project.user.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
class UserDtoMapper {
    UserDto toDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setName(user.getName());
        return userDto;
    }

    List<UserDto> toDto(List<User> users) {
        return users.stream().map(this::toDto).collect(Collectors.toList());
    }
}
