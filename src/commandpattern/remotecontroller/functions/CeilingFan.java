package commandpattern.remotecontroller.functions;

public class CeilingFan extends Functionality {

    public static final int HIGH  = 3;
    public static final int MEDIUM  = 2;
    public static final int LOW  = 1;
    public static final int OFF  = 0;
    int speed;

    public CeilingFan(String location) {
        this.type = location;
        speed = OFF;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void off() {
        speed = OFF;
    }

    public void on() {
        speed = LOW;
    }

    public void increaseSpeed() {
        if(getSpeed()!=CeilingFan.HIGH) {
            System.out.println("Increasing Speed");
            this.speed = speed+1;
        }
    }

    public void decreaseSpeed() {
        if(getSpeed()!=CeilingFan.OFF) {
            System.out.println("Increasing Speed");
            this.speed = speed-1;
        }
    }

}
