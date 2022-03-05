package com.nekit.desafio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nekit.desafio.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
