package com.kotoki.stud.test_project.user;

import com.kotoki.stud.test_project.account_information.AccountRepository;
import com.kotoki.stud.test_project.account_information.AccountService;
import com.kotoki.stud.test_project.custom_exception.SearchException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private AccountService accountService;

    void create(User user) {
        userRepository.save(user);
    }

    List<User> findAll() {
        return userRepository.findAll();
    }

    User findById(Long id) throws SearchException {
        return userRepository.findById(id).orElseThrow(() -> new SearchException("Not valid id"));
    }

    User findByLogin(String login) {
        return userRepository.findById(accountService.findIdByLogin(login)).orElse(null);
    }

    List<User> findAllByName(String name) {
        return userRepository.findAllByName(name);
    }

    List<User> findByEmailEndingWith(String email) {
        return userRepository.findUserByEmailContains(email);
    }

    List<User> findByNameIsLike(String name) {
        return userRepository.findUserByNameIsLike(name);
    }

    void deleteByNameEqualsAndIdEquals(String name, long id) {
        userRepository.deleteUserByNameEqualsAndIdEquals(name, id);
    }

}