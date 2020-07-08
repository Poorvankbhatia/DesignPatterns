package startegypattern.fighter;

import startegypattern.fighter.behaviours.LongJump;
import startegypattern.fighter.behaviours.TornadoKick;
import startegypattern.fighter.fighter.Fighter;
import startegypattern.fighter.fighter.Ryu;

public class StreetFighter {

    public static void main(String[] args) {
        Fighter ryu = new Ryu();
        ryu.setJumpBehaviour(new LongJump());
        ryu.setKickBehaviour(new TornadoKick());
        ryu.display();
        ryu.punch();
        ryu.roll();
        ryu.performJump();
        ryu.performKick();
    }

}
