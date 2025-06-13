package com.example.games.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_belonging")
public class Belonging {

	@EmbeddedId
	private BelongingPk id = new BelongingPk();
	
	@Column(name = "POSITION")
	private Integer posititon;
	
	public Belonging() {
		
	}

	public Belonging(Game game, GameList gamelist, Integer posititon) {
		this.id.setGame(game);
		this.id.setList(gamelist);
		this.posititon = posititon;
	}

	public BelongingPk getId() {
		return id;
	}

	public void setId(BelongingPk id) {
		this.id = id;
	}

	public Integer getPosititon() {
		return posititon;
	}

	public void setPosititon(Integer posititon) {
		this.posititon = posititon;
	}
	
	
}
