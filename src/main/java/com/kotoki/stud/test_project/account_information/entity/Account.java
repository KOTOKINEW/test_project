package com.kotoki.stud.test_project.account_information.entity;

import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name = "account_information", schema = "db_schema")
@Data
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;

    @Column
    private String login;

    @Column
    private String password;

    @Override
    public String toString() {
        return "Account{" +
                "user_id=" + user_id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}