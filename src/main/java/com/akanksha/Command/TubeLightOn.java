package com.akanksha.Command;

public class TubeLightOn implements Command {

    TubeLight tubeLight;
    public TubeLightOn(TubeLight tubeLight) {
        this.tubeLight=tubeLight;
    }

    @Override
    public void execute() {
        tubeLight.setOn();
    }
}
