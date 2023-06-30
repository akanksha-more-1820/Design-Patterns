package com.akanksha.Command;

public class TubeLightOff implements Command{

    TubeLight tubeLight;


    @Override
    public void execute() {
        tubeLight.setOff();
    }

    public TubeLightOff(TubeLight tubeLight) {
        this.tubeLight = tubeLight;
    }
}
