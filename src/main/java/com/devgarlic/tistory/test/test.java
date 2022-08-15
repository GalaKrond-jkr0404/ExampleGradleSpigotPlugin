package com.devgarlic.tistory.test;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
public class test extends JavaPlugin{
    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[TEST] Hello World :)");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[TEST] Goodbye Sengen :)");
    }
}
