package com.example.backwazapatrick.dao;

import com.example.backwazapatrick.model.User;
import org.springframework.data.jpa.repository.Query;

public interface AuthentificationDao extends jpaRepository<User, Integer> {

    @Query("SELECT u FROM User u WHERE u.login = ?1 and u.passeword = ?2")
    User findUserByStatusAndName(String login, String pw);
}
