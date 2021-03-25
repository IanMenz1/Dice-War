// Import the Scanner class
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Welcome to Die War! No Skill! All Luck ;)");
        System.out.println("Bet away your life earnings and hope the house doesn't always win!");
        System.out.println("");

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Enter the number of rounds: ");
        int roundNum = myObj.nextInt();  // Read user input
        myObj.nextLine();

        System.out.println("Enter the kind of die player1 wants to use, Die(1) or LoadedDie(2): ");
        int diceType1 = myObj.nextInt();  // Read user input
        myObj.nextLine();

        System.out.println("Enter the kind of die player2 wants to use, Die(1) or LoadedDie(2): ");
        int diceType2 = myObj.nextInt();  // Read user input
        myObj.nextLine();

        System.out.println("Enter the number of sides player1 wants for the dice: ");
        int diceSide1 = myObj.nextInt();  // Read user input
        myObj.nextLine();

        System.out.println("Enter the number of sides player2 wants for the dice: ");
        int diceSide2 = myObj.nextInt();  // Read user input
        myObj.nextLine();

        //variables
        Die player1;
        Die player2;
        int score1 = 0;
        int score2 = 0;
        int sum1 = 0;
        int sum2 = 0;

        //constructing proper dice
        if(diceType1 == 1) {
            player1 = new Die(diceSide1);
        }
        else {
            player1 = new LoadedDie(diceSide1);
        }

        if(diceType2 == 1) {
            player2 = new Die(diceSide2);
        }
        else {
            player2 = new LoadedDie(diceSide2);
        }

        //running rounds
        for(int i = 0; i < roundNum; i++) {
            int randNum1 = player1.randNum();
            int randNum2 = player2.randNum();

            if(diceType1 == 1) {
                System.out.println("Player1 is using Die with " + diceSide1 + " sides");
            }
            else {
                System.out.println("Player1 is using LoadedDie! with " + diceSide1 + " sides");
            }

            if(diceType2 == 1) {
                System.out.println("Player2 is using Die with " + diceSide2 + " sides");
            }
            else {
                System.out.println("Player2 is using LoadedDie with " + diceSide2 + " sides");
            }

            //sum counter
            sum1 = sum1 + randNum1;
            sum2 = sum2 + randNum2;

            System.out.println("Player1 got " + randNum1);
            System.out.println("Player2 got " + randNum2);

            if(randNum1 > randNum2) {
                score1++;
                System.out.println("Player1 got a point!");
            }
            else if(randNum2 > randNum1) {
                score2++;
                System.out.println("Player2 got a point!");
            }
            else {
                System.out.println("Tie! No point!");
            }
            System.out.println("");
            //pause game to read output per round
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }

        //final results
        System.out.println("Player1 has " + score1 + " points and Player2 has " + score2 + " points");
        System.out.println("Player1 has an average roll of " + (float) sum1/roundNum + " and Player1 has an average roll of " + (float) sum2/roundNum);
        if(score1 > score2) {
            System.out.println("Player1 won!");
        }
        else if(score2 > score1) {
            System.out.println("Player2 won!");
        }
        else {
            System.out.println("Tie! Horrible Game!");
        }
    }
}
