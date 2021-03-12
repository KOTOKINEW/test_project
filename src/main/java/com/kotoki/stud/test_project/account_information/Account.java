package com.kotoki.stud.test_project.account_information;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account_information", schema = "db_schema")
@Data
class Account {
    @Id
    @Column(name = "user_id")
    private Long userId;

    @Column
    private String login;

    @Column
    private String password;

    @Override
    public String toString() {
        return "Account{" +
                "user_id=" + userId +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}