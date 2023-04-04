package com.jspider.studentMangment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jspider.studentMangment.Model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
