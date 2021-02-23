package com.kotoki.stud.test_project.account_information;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Configuration
@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
    Account findByLogin(String login);
}
