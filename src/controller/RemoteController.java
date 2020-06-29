package controller;

import command.Command;
import command.NoCommand;

public class RemoteController {
    Command[] onCommands;
    Command[] offCommands;

    public RemoteController() {
        onCommands = new Command[2];
        offCommands = new Command[2];

        // this is to prevent null check for each slot
        Command noCommand = new NoCommand();
        for (int i = 0; i < 2; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButton(int slot) {
        onCommands[slot].execute();
    }

    public void offButton(int slot) {
        offCommands[slot].execute();
    }

    public String toString() {
        StringBuffer stringBuff = new StringBuffer(); stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName() + " " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }
}
