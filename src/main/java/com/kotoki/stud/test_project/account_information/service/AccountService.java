package com.kotoki.stud.test_project.account_information.service;

import com.kotoki.stud.test_project.account_information.entity.Account;
import com.kotoki.stud.test_project.account_information.repository.AccountRepository;
import com.kotoki.stud.test_project.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public List<Account> findAll() {
        return accountRepository.findAll();
    }
    public List<Account> findAccountByLogin(String login) {
        return accountRepository.findAccountByLogin(login);
    }
    public Account findById(Long accountId) {
    return accountRepository.findById(accountId).orElse(null);
}
}
