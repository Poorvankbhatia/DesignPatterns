package commandpattern.remotecontroller.functions;

public abstract class Functionality {

    String type;

    public void on() {
        System.out.println(type+" "+"ON");
    }

    public void off() {
        System.out.println(type+" "+"OFF");
    }

}
