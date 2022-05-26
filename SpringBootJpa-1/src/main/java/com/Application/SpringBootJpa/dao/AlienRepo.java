package com.Application.SpringBootJpa.dao;

import com.Application.SpringBootJpa.Model.Alien;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AlienRepo extends JpaRepository<Alien, Integer> {

//	List<Alien> findByTech(String tech);
//
//	List<Alien> findByAidGreaterThan(int aid);
//
//	@Query("from Alien where tech=?1 order by aname")
//	List<Alien> findByTechSorted(String tech);

}
