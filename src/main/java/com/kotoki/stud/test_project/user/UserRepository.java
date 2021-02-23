package com.kotoki.stud.test_project.user;

import com.kotoki.stud.test_project.user.User;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Configuration
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findAllByName(String name);

    List<User> findUserByEmailContains(String email);

    List<User> findUserByNameIsLike(String name);


    @Transactional
    void deleteUserByNameEqualsAndIdEquals(String name, long id);
}
