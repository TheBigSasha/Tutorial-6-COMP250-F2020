package TheScicilian;

import java.util.Random;
import java.util.Scanner;

public class RandomGame {
    public static void main(String args[]) {
        Random rand = new Random();
        int seed = (int) System.nanoTime();
        rand.setSeed(seed);
        System.out.println("Seed is " + seed);

        System.out.println(" We are playing a betting game. Guess a number between 1 and 3");
        int number = rand.nextInt(2) + 1;       //rand gives a random number between 0 and 2, we add 1 to make that 1 and 3
        Scanner s = new Scanner(System.in);
        if (s.nextInt() == number) {
            System.out.println("you win!");
        } else {
            System.out.println("You fail! Number was: " + number);
        }


    }
}
