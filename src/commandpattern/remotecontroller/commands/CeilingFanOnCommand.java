package commandpattern.remotecontroller.commands;

import commandpattern.remotecontroller.functions.CeilingFan;

public class CeilingFanOnCommand implements Command {

    private CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.on();
    }

    @Override
    public void undo() {
        ceilingFan.setSpeed(prevSpeed);
    }
}
