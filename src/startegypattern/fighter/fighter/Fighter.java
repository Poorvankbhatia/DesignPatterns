package startegypattern.fighter.fighter;

import startegypattern.fighter.behaviours.JumpBehaviour;
import startegypattern.fighter.behaviours.KickBehaviour;

public abstract class Fighter {

    /**
     * The Fighter class will now delegate its kick and jump behavior instead of using kick and jump methods defined
     * in the Fighter class or its subclass.
     */
    private KickBehaviour kickBehaviour;
    private JumpBehaviour jumpBehaviour;

    public void setKickBehaviour(KickBehaviour kickBehaviour) {
        this.kickBehaviour = kickBehaviour;
    }

    public void setJumpBehaviour(JumpBehaviour jumpBehaviour) {
        this.jumpBehaviour = jumpBehaviour;
    }

    public abstract void display();

    public void punch() {
        System.out.println("Fighter punches.");
    }

    public void roll() {
        System.out.println("Fighter rolls.");
    }

    public void performKick() {
        kickBehaviour.kick();
    }

    public void performJump() {
        jumpBehaviour.Jump();
    }

}
