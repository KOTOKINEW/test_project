package com.kotoki.stud.test_project.user;

import com.kotoki.stud.test_project.custom_exception.SearchException;
import com.kotoki.stud.test_project.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@RequestMapping("api")
public interface UserEndpoint {
    @GetMapping("/all")
    List<UserDto> getAll();

    @GetMapping("/user-id")
    User getByAccountId(Long accountId) throws SearchException;
}
