package com.kotoki.stud.test_project.account_information;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Configuration
@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
    Account findByLogin(String login);

    @Query(value = "SELECT user_id FROM db_schema.account_information a WHERE a.login = :login", nativeQuery = true)
    Long findIdByLogin( @Param("login")String login);
}
