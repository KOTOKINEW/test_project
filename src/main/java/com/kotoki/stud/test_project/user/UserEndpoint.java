package com.kotoki.stud.test_project.user;

import com.kotoki.stud.test_project.custom_exception.SearchException;
import com.kotoki.stud.test_project.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("api/users")
interface UserEndpoint {
    @GetMapping("/all")
    List<UserDto> getAll();

    @GetMapping("/id{id}")
    User getById(@PathVariable("id") Long accountId) throws SearchException;

    @GetMapping("/login{login}")
    User getByLogin(@PathVariable("login") String login);
}
