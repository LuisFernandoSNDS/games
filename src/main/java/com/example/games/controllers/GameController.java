package com.example.games.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.games.dto.GameDto;
import com.example.games.dto.GameMinDto;
import com.example.games.services.GameService;


@RestController
@RequestMapping(value = "/games")
public class GameController {

	@Autowired
	private GameService service;
	
	@GetMapping
	public String hello() {
		return "helloo";
	}
	
	@GetMapping(value = "/getAll")
	public List<GameMinDto> findAll() {
		List<GameMinDto> list = service.findAll();
		return list;
	}
	
	@GetMapping(value = "/{id}")
	public GameDto findById(@PathVariable Long id) {
		GameDto game = service.findById(id);
		return game;
	}
 	
}
