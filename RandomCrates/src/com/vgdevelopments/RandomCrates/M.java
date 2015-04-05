package com.vgdevelopments.RandomCrates;

import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class M extends JavaPlugin {
	
	public void onEnable() {
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(!(sender instanceof Player)) {
			return true;
		}
		
		Player p = (Player) sender;
		
		if(cmd.getName().equalsIgnoreCase("randomcrates")) {
			if(Permissions.RANDOMCRATES.hasPermission(p)) {
				Random random = new Random();
				int i = random.nextInt(6);
				
				switch(i) {
				case 0:
					p.sendMessage(ChatColor.GREEN + "You have won a diamond!");
					p.getInventory().addItem(new ItemStack(Material.DIAMOND, 1));
					break;
				case 1:
					p.sendMessage(ChatColor.YELLOW + "You have won a gold ingot!");
					p.getInventory().addItem(new ItemStack(Material.GOLD_INGOT, 1));
					break;
				case 2:
					p.sendMessage(ChatColor.BLUE + "You have won 16 lapis lazuli block!");
					p.getInventory().addItem(new ItemStack(Material.LAPIS_BLOCK, 16));
					break;
				default:
					p.sendMessage(ChatColor.RED + "You have won nothing! Haha!");
					break;
				}
			}else{
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4Invalid Permission : Please contact a staff member to receive the correct permission!"));
			}
		}
		
		return false;
	}
	

}
