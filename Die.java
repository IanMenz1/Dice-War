public class Die {
    //instance variable
    public int diceSide1;

    //constructor
    public Die (int input) {
        this.diceSide1 = input;
    }

    //roll
    public int randNum() {
        int randNum = (int) (Math.random() * diceSide1 + 1);
        return randNum;
    }
}
