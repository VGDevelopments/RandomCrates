package com.vgdevelopments.RandomCrates;

import org.bukkit.entity.Player;

public enum Permissions {

	RANDOMCRATES("randomcrates.use");
	
	private String perms; 
	
	Permissions(String permissions) {
		this.perms = permissions;
	}
	
	public String getPerms() {
		return perms; 
	}
	
	public boolean hasPermission(Player player) {
		return player.hasPermission(perms);
	}
	
}
