package commandpattern.remotecontroller.commands;

import commandpattern.remotecontroller.functions.Stereo;

public class StereoOffCommand implements Command {

    private Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.setVolume(0);
        stereo.removeCD();
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
}
