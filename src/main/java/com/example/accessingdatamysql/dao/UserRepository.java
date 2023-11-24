package com.example.accessingdatamysql.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.accessingdatamysql.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
