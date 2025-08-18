package com.luistat.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luistat.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
