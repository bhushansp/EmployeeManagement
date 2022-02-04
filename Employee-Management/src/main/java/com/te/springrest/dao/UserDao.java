package com.te.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.springrest.model.User;
@Repository
public interface UserDao extends JpaRepository<User, Integer> {

}
