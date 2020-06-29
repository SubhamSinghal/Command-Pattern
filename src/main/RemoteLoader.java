package main;

import command.FanOffCommand;
import command.FanOnCommand;
import command.LightOffCommand;
import command.LightOnCommand;
import controller.RemoteController;
import receiver.Fan;
import receiver.Light;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteController remoteController = new RemoteController();

        Light livingRoomLight = new Light();
        Fan ceilingFan = new Fan();

        LightOnCommand lightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand lightOffCommand = new LightOffCommand(livingRoomLight);

        FanOnCommand fanOnCommand = new FanOnCommand(ceilingFan);
        FanOffCommand fanOffCommand = new FanOffCommand(ceilingFan);

        remoteController.setCommand(0, lightOnCommand, lightOffCommand);
        remoteController.setCommand(1, fanOnCommand, fanOffCommand);

        System.out.println(remoteController.toString());

        remoteController.onButton(0);
        remoteController.onButton(1);

        remoteController.offButton(1);
        remoteController.offButton(0);
    }

}
