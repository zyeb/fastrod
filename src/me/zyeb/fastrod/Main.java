package me.zyeb.fastrod;

import org.bukkit.plugin.java.*;
import org.bukkit.event.*;
import java.io.*;
import org.bukkit.configuration.file.*;
import org.bukkit.*;
import org.bukkit.plugin.*;
import org.bukkit.command.*;

public class Main extends JavaPlugin implements CommandExecutor, Listener
{
    public static Main instance;
    public static File file;
    public static Boolean debug;
    public static Object plugin;
    private FileConfiguration config;
    
    static {
        Main.debug = false;
    }
    
    public void onEnable() {
        final PluginManager pm = Bukkit.getServer().getPluginManager();
        Bukkit.getServer().getPluginManager().registerEvents(new GUI(), this);
        (Main.instance = this).saveDefaultConfig();
        this.config = this.getConfig();
        this.config.options().copyDefaults(true);
        this.saveConfig();
        Main.instance = this;
        this.config = this.getConfig();
        final CommandSender console = (CommandSender)this.getServer().getConsoleSender();
        console.sendMessage("§2-=-=-=-=-=-=-=-=-=-= §aFastRod §2-=-=-=-=-=-=-=-=-=-= ");
        console.sendMessage("           §2Plugin enabled correctly");
        console.sendMessage("              §2Made by zyeb");
        console.sendMessage("                    §2Version: " + this.getDescription().getVersion());
        console.sendMessage("§2-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
    
    public void onDisable() {
        final CommandSender console = (CommandSender)this.getServer().getConsoleSender();
        console.sendMessage("§4-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        console.sendMessage("   §cPlugin disabled correctly");
        console.sendMessage("§4-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
    
    public static Main getInstance() {
        return Main.instance;
    }
}
