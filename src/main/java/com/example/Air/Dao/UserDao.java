package com.example.Air.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Air.pojo.User;
@Repository
public interface UserDao extends JpaRepository {
	
	User findByUserName(String userName);

}
