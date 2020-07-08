package commandpattern.remotecontroller;

import commandpattern.remotecontroller.commands.*;
import commandpattern.remotecontroller.functions.GarageDoor;
import commandpattern.remotecontroller.functions.Light;
import commandpattern.remotecontroller.functions.Stereo;

public class RemoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl control = new SimpleRemoteControl();
        Light light = new Light("Living room light");
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        control.setCommands(0,lightOnCommand,lightOffCommand);

        GarageDoor garageDoor = new GarageDoor("Door");
        GarbageDoorOpenCommand garbageDoorOpenCommand = new GarbageDoorOpenCommand(garageDoor);
        GarbageDoorOffCommand garbageDoorOffCommand = new GarbageDoorOffCommand(garageDoor);
        control.setCommands(2, garbageDoorOpenCommand, garbageDoorOffCommand);

        Stereo stereo = new Stereo("Stereo");
        StereoOnCommand stereoCommand = new StereoOnCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
        control.setCommands(3, stereoCommand, stereoOffCommand);

        for (int i=0;i<7;i++) {
            control.onButtonPushed(i);
            control.offButtonPushed(i);
            control.undo();
        }

    }

}
