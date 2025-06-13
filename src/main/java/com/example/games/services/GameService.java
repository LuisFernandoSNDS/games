package com.example.games.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.games.dto.GameDto;
import com.example.games.dto.GameMinDto;
import com.example.games.entities.Game;
import com.example.games.projections.GameMinProjection;
import com.example.games.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository repository;
	
	@Transactional(readOnly = true)
	public List<GameMinDto> findAll() {
		
		List<Game> list = repository.findAll();
		return list.stream().map(x -> new GameMinDto(x)).toList();
	}
	
	@Transactional(readOnly = true)
	public GameDto findById(Long id) {
		Game game = repository.findById(id).get();
		return new GameDto(game);
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDto> findByList(Long listId) {
		List<GameMinProjection> list = repository.searchByList(listId);
		return list.stream().map(x -> new GameMinDto(x)).toList();
	}
	
	
}
