package com.badwater.bot.helpers.JsonConfiguration;

import java.util.*;

/**
 * @author Krystal Amaia
 */
public class JsonConfig {
	private String            name;
	private String            server;
	private String            nick;
	private String            login;
	private boolean           authenticate;
	private String            password;
	private ArrayList<String> autoJoinChannels;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getServer() {
		return this.server;
	}

	public void setServer(String server) {
		this.server = server;
	}

	public String getNick() {
		return this.nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public boolean getAuthenticate() {
		return this.authenticate;
	}

	public void setAuthenticate(boolean authenticate) {
		this.authenticate = authenticate;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ArrayList<String> getAutoJoinChannels() {
		return this.autoJoinChannels;
	}

	public void setAutoJoinChannels(ArrayList<String> autoJoinChannels) {
		this.autoJoinChannels = autoJoinChannels;
	}
}

