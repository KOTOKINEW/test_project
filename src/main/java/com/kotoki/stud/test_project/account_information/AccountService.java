package com.kotoki.stud.test_project.account_information;

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
    public Account findByLogin(String login) {
        return accountRepository.findByLogin(login);
    }
    public Account findByUserId(Long accountId) {
    return accountRepository.findById(accountId).orElse(null);
}
}
