package observerpattern.cricketdata;

public class CricketMessage {

    final int runs;
    final int wickets;
    final double overs;

    public CricketMessage(int runs, int wickets, double overs) {
        this.runs = runs;
        this.wickets = wickets;
        this.overs = overs;
    }

    public int getRuns() {
        return runs;
    }

    public int getWickets() {
        return wickets;
    }

    public double getOvers() {
        return overs;
    }
}
