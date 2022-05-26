package com.Application.SpringBootJpa.Controller;

import java.util.List;
import java.util.Optional;

import com.Application.SpringBootJpa.Model.Alien;
import com.Application.SpringBootJpa.dao.AlienRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlienController {

	@Autowired
	AlienRepo repo;

	@RequestMapping("/ad")
	public String home() {
		return "NewFile.html";
	}

	@DeleteMapping("/alien/{aid}")
	public String deleteAlien(@PathVariable int aid) {
		Alien a = repo.getOne(aid);
		repo.delete(a);
		return "deleted";
	}

	@PostMapping("/alien")
	public Alien addAlien(@RequestBody Alien alien) {
		repo.save(alien);
		return alien;

	}

	@PutMapping("/alien")
	public Alien SaveOrUpdateAlien(@RequestBody Alien alien) {
		repo.save(alien);
		return alien;

	}

	@GetMapping(path = "/aliens")

	public List<Alien> getAliens() {
//		Alien alien = repo.findById(aid).orElse(new Alien());

//		System.out.println(repo.findByTech("java"));
//		System.out.println(repo.findByAidGreaterThan(102));
//		System.out.println(repo.findByTechSorted("java"));

		return repo.findAll();

	}

	@RequestMapping("/alien/{aid}")

	public Optional<Alien> getAlien(@PathVariable("aid") int aid) {
//
////		Alien alien = repo.findById(aid).orElse(new Alien());
//
////		System.out.println(repo.findByTech("java"));
////		System.out.println(repo.findByAidGreaterThan(102));
////		System.out.println(repo.findByTechSorted("java"));
//
		return repo.findById(aid);
//
	}

}
