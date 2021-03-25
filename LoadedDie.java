public class LoadedDie extends Die {
    public LoadedDie(int diceSide1) {
        super(diceSide1);
    }

    public int randNum() {
        int randNum = (int) (Math.random()* diceSide1 + 2) - 1;
        return randNum;
    }
}
