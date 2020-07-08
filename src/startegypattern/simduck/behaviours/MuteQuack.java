package startegypattern.simduck.behaviours;

public class MuteQuack implements QuackingBehaviour {

    @Override
    public void quack() {
        System.out.println("<<SILENCE>>");
    }
}
