package me.gleeming.banana.util;

import me.gleeming.banana.util.python.MainPython;
import rlbot.manager.BotManager;

public class Main {
    /*
        Main program method, runs the python portion
        of the code so the bot starts working
    */
    public static void main(String[] args) throws Exception {
        BotManager botManager = new BotManager();
        int port = 17357;

        MainPython pythonInterface = new MainPython(port, botManager);
        new Thread(pythonInterface::start).start();
    }
}
