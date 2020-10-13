package de.otto.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import de.otto.demo.model.Player;

@Service
public class PlayerServiceImpl implements PlayerService {
	private static List<Player> players = new ArrayList<>();

	static {
		players.add(new Player(1,"Aroddo", "Armin", "Otto"));
		players.add(new Player(2,"Spidey", "Peter", "Parker"));
		players.add(new Player(3,"Hulk", "Bruce", "Banner"));
		players.add(new Player(4,"Muhrica", "Steve", "Rogers"));
		players.add(new Player(5,"Irony", "Tony", "Stark"));
	}

	@Override
	public List<Player> getAll() {
		return players;
	}
	
}
