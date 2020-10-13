package de.otto.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import de.otto.demo.model.Player;


public interface PlayerService {
	
	public List<Player> getAll();
}
