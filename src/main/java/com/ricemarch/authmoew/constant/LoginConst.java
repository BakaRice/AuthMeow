package com.ricemarch.authmoew.constant;

import org.bukkit.ChatColor;

/**
 * @author tanwentao
 * @since 2022/5/26
 */

public class LoginConst {

    private LoginConst() {
        //no use
    }


    ////login
    public static final String LOGIN_ALREADY_LOGGED = ChatColor.GREEN + "你已经登录了！";

    public static final String LOGIN_NO_INPUT_PWD = ChatColor.RED + "必须输入密码！";

    public static final String LOGIN_WELCOME = ChatColor.GREEN + "登录成功，欢迎回来！";

    public static final String LOGIN_ERROR_PWD = ChatColor.RED + "密码错误！";


    ////register
    public static final String REGISTER_SUCCESS = ChatColor.GREEN + "注册成功！";

}
