package com.example.games.dto;

import com.example.games.entities.GameList;

public class GameListDto {

	private Long id;
	private String name;
	
	public GameListDto() {
		
	}
	
	public GameListDto(GameList gamelist) {
		super();
		this.id = gamelist.getId();
		this.name = gamelist.getName();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
