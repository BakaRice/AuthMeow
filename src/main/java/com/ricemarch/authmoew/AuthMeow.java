package com.ricemarch.authmoew;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

/**
 * @author tanwentao
 * @since 2022/5/26
 */

public class AuthMeow extends JavaPlugin {
    public static JavaPlugin instance;

    @Override
    public void onLoad() {
        saveDefaultConfig();
    }

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new EventListener(), this);
        Objects.requireNonNull(Bukkit.getPluginCommand("login")).setExecutor(new CommandHandler());
        instance = this;
    }

    @Override
    public void onDisable() {
        saveConfig();
    }
}
