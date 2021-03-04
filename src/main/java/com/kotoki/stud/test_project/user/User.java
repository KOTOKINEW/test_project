package com.kotoki.stud.test_project.user;

import lombok.*;
import javax.persistence.*;

@Entity
@Table(name = "user", schema = "db_schema")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private String phone;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
