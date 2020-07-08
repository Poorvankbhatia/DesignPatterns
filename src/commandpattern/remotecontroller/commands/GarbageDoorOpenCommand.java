package commandpattern.remotecontroller.commands;

import commandpattern.remotecontroller.functions.GarageDoor;

public class GarbageDoorOpenCommand implements Command {

    private GarageDoor garageDoor;

    public GarbageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.on();
    }

    @Override
    public void undo() {
        garageDoor.off();
    }
}
