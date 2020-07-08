package commandpattern.remotecontroller;

import commandpattern.remotecontroller.commands.Command;
import commandpattern.remotecontroller.commands.EmptyCommand;

/*
Invoker.
 */
public class SimpleRemoteControl {

    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public SimpleRemoteControl() {
        this.onCommands = new Command[7];
        this.offCommands = new Command[7];

        for (int i=0;i<7;i++) {
            this.onCommands[i] = new EmptyCommand(); // We don't want to do a null check so we added a null object.
            this.offCommands[i] = new EmptyCommand();
        }
        undoCommand = new EmptyCommand();
    }

    public void setCommands(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undo() {
        undoCommand.undo();
    }

}
