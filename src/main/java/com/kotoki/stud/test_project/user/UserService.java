package com.kotoki.stud.test_project.user;

import com.kotoki.stud.test_project.user.User;
import com.kotoki.stud.test_project.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void createUsers(User user) {
        userRepository.save(user);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Long userId) {
        return userRepository.findById(userId).orElse(null);
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