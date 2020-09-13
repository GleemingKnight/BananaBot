package me.gleeming.banana;

import lombok.Getter;
import me.gleeming.banana.controls.ControlsOutput;
import rlbot.Bot;
import rlbot.ControllerState;
import rlbot.flat.GameTickPacket;

public class BananaBot implements Bot {

    /* Player index on the server */
    @Getter private final int index;

    public BananaBot(int playerIndex) {
        this.index = playerIndex;
    }

    /* Used to process inputs every frame */
    public ControllerState processInput(GameTickPacket gameTickPacket) {
        ControlsOutput controlsOutput = new ControlsOutput();

        controlsOutput.setThrottle(100);

        return controlsOutput;
    }

    /* Called whenever the bot is closed down */
    public void retire() {
        //todo
    }
}
