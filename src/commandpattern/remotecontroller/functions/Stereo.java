package commandpattern.remotecontroller.functions;

public class Stereo extends Functionality {
    int volume;

    public Stereo(String type) {
        this.type = type;
    }

    public void setCD() {
        System.out.println(type+" "+"Setting CD.");
    }

    public void removeCD() {
        System.out.println(type+" "+"Removing CD.");
    }

    public void setVolume(int volume) {
        System.out.println("Setting volume - " + volume);
        this.volume = volume;
    }



}
