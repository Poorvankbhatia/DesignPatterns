package commandpattern.remotecontroller.functions;

public class GarageDoor extends Functionality {

    public GarageDoor(String type) {
        this.type = type;
    }

    private void open() {
        System.out.println(type+" "+"OPEN");
    }

    private void close() {
        System.out.println(type+" "+"CLOSE");
    }

    @Override
    public void on() {
       open();
    }

    @Override
    public void off() {
        close();
    }
}
