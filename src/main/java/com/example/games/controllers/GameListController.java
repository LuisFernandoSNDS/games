package com.example.games.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.games.dto.GameListDto;
import com.example.games.dto.GameMinDto;
import com.example.games.services.GameListService;
import com.example.games.services.GameService;

@RestController
@RequestMapping(value = "/gameslist")
public class GameListController {

	@Autowired
	private GameListService service;
	
	@Autowired
	private GameService gameService;
	
	@GetMapping(value = "/getAll")
	public List<GameListDto> getAll() {
		List<GameListDto> list = service.findAll();
		return list;
	}
	
	@GetMapping(value = "/{id}")
	public GameListDto getId(@PathVariable Long id) {
		GameListDto gameList = service.findById(id);
		return gameList;
	}
	
	@GetMapping(value = "/{listId}/games")
	public List<GameMinDto> findByList(@PathVariable Long listId) {
		List<GameMinDto> result = gameService.findByList(listId);
		return result;
	}
	
}
