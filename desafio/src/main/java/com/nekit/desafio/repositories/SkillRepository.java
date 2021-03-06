package com.nekit.desafio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nekit.desafio.entities.Skill;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Integer> {

}
