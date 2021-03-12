package com.kotoki.stud.test_project.user;

import com.kotoki.stud.test_project.custom_exception.SearchException;
import com.kotoki.stud.test_project.dto.UserDto;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
class UserController implements UserEndpoint {

    @Autowired
    private UserService userService;

    @Autowired
    private UserDtoMapper userDtoMapper;

    @Override
    @ApiOperation(value = "")
    public List<UserDto> getAll() {
        return userDtoMapper.toDto(userService.findAll());
    }

    @Override
    @ApiOperation(value = "")
    public User getById(Long id) throws SearchException {
        return userService.findById(id);
    }

    @Override
    public User getByLogin(String login) {
        return userService.findByLogin(login);
    }

}
