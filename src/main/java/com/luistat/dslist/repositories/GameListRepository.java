package com.luistat.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luistat.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
