import java.util.Random;
import java.util.Scanner;

public class MyDiceRoller {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numOfDice;
        int total = 0;
        int dicePrediction;
        int guess;

        System.out.print("Enter the # of dice to roll \uD83C\uDFB2: ");
        numOfDice = scanner.nextInt();

        System.out.printf("You've rolled %d dice!\n", numOfDice);
        System.out.printf("Your total will likely be between %d and %d. \uD83E\uDD14 \n",
                numOfDice,numOfDice*6);
        System.out.print("Take a guess! \uD83D\uDE01: ");
        guess = scanner.nextInt();


        if (numOfDice > 0) {

            for (int i =0; i < numOfDice; i++ ){
                int roll = random.nextInt(1,7);
                printDie(roll);
                System.out.println("You rollled: " + roll);
                total += roll;
            }
            System.out.println("Total: " + total);


        }
        else {
            System.out.println("# of dice must be greater than 0");
        }

        if (guess == total) {
            System.out.printf("\uD83D\uDE32 The answer is %d... and your guess is %d too?! \uD83E\uDD20",total,guess);
            System.out.printf(" I can't believe it — we have a winner! You're on fire today! \uD83E\uDD73");
        }
        else {
            System.out.println("Didn’t think you'd get it right — and yep, you didn’t! \uD83D\uDE0F");
            System.out.println("But hey, don’t feel bad, that was a sneaky one! \uD83D\uDE09");
        }

        scanner.close();
    }
    static void printDie(int roll) {

        String dice1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;

        String dice2 = """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------
                """;

        String dice3 = """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                """;

        String dice4 = """
                 -------
                | ●    ● |
                |        |
                | ●    ● |
                 -------
                """;

        String dice5 = """
                 -------
                | ●    ● |
                |    ●   |
                | ●    ● |
                 -------
                """;

        String dice6 = """
                 -------
                | ●    ● |
                | ●    ● |
                | ●    ● |
                 -------
                """;

        switch (roll) {
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("Invalid Roll!");
        }
    }
}

