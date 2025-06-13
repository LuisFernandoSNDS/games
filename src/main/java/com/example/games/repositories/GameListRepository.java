package com.example.games.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.games.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
