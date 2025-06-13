package com.example.games.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.games.dto.GameDto;
import com.example.games.dto.GameListDto;
import com.example.games.dto.GameMinDto;
import com.example.games.entities.GameList;
import com.example.games.projections.GameMinProjection;
import com.example.games.repositories.GameListRepository;

@Service
public class GameListService {

	@Autowired
	private GameListRepository repository;
	
	
	@Transactional(readOnly = true)
	public List<GameListDto> findAll() {
		
		List<GameList> list = repository.findAll();
		return list.stream().map(x -> new GameListDto(x)).toList();
	}
	
	@Transactional(readOnly = true)
	public GameListDto findById(Long id) {
		GameList gamelist = repository.findById(id).get();
		return new GameListDto(gamelist);
	
	}
	

	
	
	
	
	public void move(Integer initIndex, Integer finIndex) {
		
		
	}
}
