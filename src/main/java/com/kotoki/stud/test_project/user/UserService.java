package com.kotoki.stud.test_project.user;

import com.kotoki.stud.test_project.account_information.AccountRepository;
import com.kotoki.stud.test_project.custom_exception.SearchException;
import com.kotoki.stud.test_project.utils.UserDtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private final UserRepository userRepository;
    @Autowired
    private final AccountRepository accountRepository;

    public UserService(UserRepository userRepository, AccountRepository accountRepository, UserDtoMapper userDtoMapper) {
        this.userRepository = userRepository;
        this.accountRepository = accountRepository;
    }

    public void createUsers(User user) {
        userRepository.save(user);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findByAccountId(Long userId) throws SearchException {

        return userRepository.findById(userId).orElseThrow(() -> new SearchException("Not valid id"));
    }

    public User findByLogin(String login) {
        return userRepository.findById(accountRepository.findByLogin(login).getUserId()).orElse(null);
    }

    public List<User> findAllByName(String name) {
        return userRepository.findAllByName(name);
    }

    public List<User> findUserByEmailEndingWith(String email) {
        return userRepository.findUserByEmailContains(email);
    }

    public List<User> findUserByNameIsLike(String name) {
        return userRepository.findUserByNameIsLike(name);
    }

    public void deleteUserByNameEqualsAndIdEquals(String name, long id) {
        userRepository.deleteUserByNameEqualsAndIdEquals(name, id);
    }

}