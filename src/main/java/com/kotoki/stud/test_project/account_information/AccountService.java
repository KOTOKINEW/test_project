package com.kotoki.stud.test_project.account_information;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    List<Account> findAll() {
        return accountRepository.findAll();
    }

    public Account findByLogin(String login) {
        return accountRepository.findByLogin(login);
    }
    public Long findIdByLogin(String login) {
        return accountRepository.findIdByLogin(login);
    }

    Account findByUserId(Long accountId) {
        return accountRepository.findById(accountId).orElse(null);
    }


}
