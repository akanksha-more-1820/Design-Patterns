package com.akanksha.Command;

public class User {

    public static void main(String[] args) {
        TubeLight tubeLight=new TubeLight();
        TubeLightOn tubeLightOn=new TubeLightOn(tubeLight);
        RemoteController remoteController=new RemoteController(tubeLightOn);
        remoteController.pressButton();
    }
}
