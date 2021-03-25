public class Die {
    //instance variable
    public int n;

    //constructor
    public Die (int input) {
        this.n = input;
    }

    //roll
    public int randNum() {
        int randNum = (int) (Math.random() * n + 1);
        return randNum;
    }
}
