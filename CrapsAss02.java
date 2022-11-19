import java.util.Random;
import java.util.Scanner;

class CrapsAss02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        boolean isNotCraps = false;
        boolean gameEnd = false;
        boolean invalidInput = false;
        String enter = "";
        String yesOrNo = "";

        do{
            System.out.print("Roll the dice!");
            int point;
            int diceRoll1 = rnd.nextInt(6) + 1;
            int diceRoll2 = rnd.nextInt(6) + 1;
            int diceRollTotal = diceRoll1 + diceRoll2;
            enter = in.nextLine();

            if (enter.equals(""))
            {
                //diceRollTotal = diceRoll1 + diceRoll2;
                System.out.println("Die 1 = " + diceRoll1);
                System.out.println("Die 2 = " + diceRoll2);
                System.out.println("Your total is " + diceRollTotal);



                if (diceRollTotal == 7 || diceRollTotal == 11)
                {
                    System.out.println("You got a natural! You win!");
                    isNotCraps = false;
                }
                else if (diceRollTotal == 2 || diceRollTotal == 3 || diceRollTotal == 13)
                {
                    System.out.println("Craps! You lose!");
                    isNotCraps = true;
                    gameEnd = true;
                }
                else
                {
                    point = diceRollTotal;
                    System.out.println( point + " is your point. Try to get the point. But, if you get 7 you lose!");
                    do{
                        System.out.println("You are trying to get the the point!");

                        enter = in.nextLine();
                        if (enter.equals(""))
                        {
                            diceRoll1 = rnd.nextInt(6) + 1;
                            diceRoll2 = rnd.nextInt(6) + 1;
                            diceRollTotal = diceRoll1 + diceRoll2;
                            System.out.println("Die 1 = " + diceRoll1);
                            System.out.println("Die 2 = " + diceRoll2);
                            System.out.println("Your total is " + diceRollTotal);


                        }
                    } while (diceRollTotal != point && diceRollTotal != 7);

                    if (diceRollTotal == 7)
                    {
                        System.out.println("Craps! You lose!");
                        gameEnd = true;
                    }
                    else if (diceRollTotal == point)
                    {
                        System.out.println("You got the point! You win!");
                        gameEnd = true;
                    }
                }


                //currentTotal = currentTotal + enteredNumber;
                //}while (enteredNumber < low || enteredNumber > high || isNotCrapsToggle == true);
                if (gameEnd = true)
                {
                    System.out.println("Do you want to play again? [Y/N]");
                    yesOrNo = in.nextLine();
                    if (yesOrNo.equalsIgnoreCase("N"))
                    {
                        isNotCraps = false;
                        break;
                    } else if (yesOrNo.equalsIgnoreCase("Y")) {
                        isNotCraps = true;
                    }

                    {
                    }
                }
            }
        } while (isNotCraps == true);
    }
}
