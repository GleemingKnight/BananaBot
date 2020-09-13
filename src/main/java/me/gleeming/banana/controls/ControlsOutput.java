package me.gleeming.banana.controls;

import lombok.Getter;
import lombok.Setter;
import rlbot.ControllerState;

public class ControlsOutput implements ControllerState {
    /* Current assets of the car */
    @Getter @Setter private float steer;
    @Getter @Setter private float throttle;

    /* Rotation of the car */
    @Getter @Setter private float pitch;
    @Getter @Setter private float yaw;
    @Getter @Setter private float roll;

    /* Current buttons pressed */
    @Getter @Setter private boolean jumpPressed = false;
    @Getter @Setter private boolean boostPressed = false;
    @Getter @Setter private boolean handbreakPressed = false;
    @Getter @Setter private boolean usingItem = false;


    public boolean holdJump() { return !jumpPressed; }
    public boolean holdBoost() { return !boostPressed; }
    public boolean holdHandbrake() { return !handbreakPressed; }
    public boolean holdUseItem() { return !usingItem; }
}
