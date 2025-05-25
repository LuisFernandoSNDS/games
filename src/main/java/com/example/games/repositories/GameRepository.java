package com.example.games.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.games.entities.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {

}
