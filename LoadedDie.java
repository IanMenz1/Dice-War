public class LoadedDie extends Die {
    public LoadedDie(int n) {
        super(n);
    }

    public int randNum() {
        int randNum = (int) (Math.random()* n + 2) - 1;
        return randNum;
    }
}
