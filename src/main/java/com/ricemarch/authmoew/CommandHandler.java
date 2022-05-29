package com.ricemarch.authmoew;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


import static com.ricemarch.authmoew.constant.LoginConst.*;

public class CommandHandler implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            return false;
        }
        if (!LoginData.hasPlayerName(sender.getName())) {
            sender.sendMessage(LOGIN_ALREADY_LOGGED);
            return true;
        }
        if (args.length == 0) {
            sender.sendMessage(LOGIN_NO_INPUT_PWD);
            return false;
        }
        String pwdConcat = String.join("<space>", args);
        if (ConfigReader.isPlayerRegistered(sender.getName())) {
            if (ConfigReader.verifyPassword(sender.getName(), pwdConcat)) {
                LoginData.removePlayerName(sender.getName());
                sender.sendMessage(LOGIN_WELCOME);
            } else {
                sender.sendMessage(LOGIN_ERROR_PWD);
            }
            return true;

        } else {
            ConfigReader.addPlayer(sender.getName(), pwdConcat);
            LoginData.removePlayerName(sender.getName());
            sender.sendMessage(REGISTER_SUCCESS);
            return true;
        }
    }
}
