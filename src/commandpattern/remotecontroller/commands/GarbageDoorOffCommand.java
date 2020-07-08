package commandpattern.remotecontroller.commands;

import commandpattern.remotecontroller.functions.GarageDoor;

public class GarbageDoorOffCommand implements Command {

    private GarageDoor garageDoor;

    public GarbageDoorOffCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.off();
    }

    @Override
    public void undo() {
        garageDoor.on();
    }
}
