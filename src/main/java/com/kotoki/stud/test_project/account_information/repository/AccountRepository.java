package com.kotoki.stud.test_project.account_information.repository;

import com.kotoki.stud.test_project.account_information.entity.Account;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Configuration
@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
//    List<Account> findByUserId(Long user_id);
    List<Account> findAll();
    List<Account> findAccountByLogin(String login);
}
