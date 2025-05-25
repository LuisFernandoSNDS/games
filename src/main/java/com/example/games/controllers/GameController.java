package com.example.games.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.games.dto.GameDto;
import com.example.games.entities.Game;
import com.example.games.services.GameService;


@RestController
@RequestMapping("/games")
public class GameController {

	@Autowired
	private GameService service;
	
	@GetMapping
	public String hello() {
		return "helloo";
	}
	
	@GetMapping("/getAll")
	public List<Game> findAll() {
		List<Game> list = service.findAll();
		//return list.stream().map(x -> new GameDto(x)).toList();
		return list;
	}
 	
}
