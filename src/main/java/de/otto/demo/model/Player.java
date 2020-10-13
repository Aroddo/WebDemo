package de.otto.demo.model;

public class Player {
	public int id;
	public String nick;
	public String firstName;
	public String lastName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Player(int id, String nick, String firstName, String lastName) {
		super();
		this.id = id;
		this.nick = nick;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public Player() {
		
	}
}
