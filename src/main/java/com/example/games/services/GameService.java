package com.example.games.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.games.entities.Game;
import com.example.games.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository repository;
	
	
	public List<Game> findAll() {
		
		List<Game> list = repository.findAll();
		return list;
	}
}
