package me.gleeming.banana.util.python;

import me.gleeming.banana.BananaBot;
import rlbot.Bot;
import rlbot.manager.BotManager;
import rlbot.pyinterop.SocketServer;

/*
    Python class so the code functions.
    Not really sure the entire function of this class,
    although RLBots needs it to function.
*/
public class MainPython extends SocketServer {
    public MainPython(int port, BotManager botManager) { super(port, botManager); }

    protected Bot initBot(int index, String botType, int team) { return new BananaBot(index); }
}
