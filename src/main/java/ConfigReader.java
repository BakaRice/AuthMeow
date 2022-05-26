import org.bukkit.configuration.file.FileConfiguration;

public final class ConfigReader {
    public static FileConfiguration config = AuthMeow.instance.getConfig();

    public static boolean isPlayerRegistered(String playerName) {

        return config.contains(playerName.toLowerCase());
    }

    public static boolean verifyPassword(String playerName, String password) {
        return password.equals(config.getString(playerName.toLowerCase()));
    }

    public static void addPlayer(String playerName, String password) {
        AuthMeow.instance.getConfig().set(playerName.toLowerCase(), password);
        AuthMeow.instance.saveConfig();
    }
}
