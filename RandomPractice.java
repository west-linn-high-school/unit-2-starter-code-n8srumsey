/**
 * Generate an int b/w [0, 9] (assign to num) the print with a label
 * Generate an int b/w [1,10] (assign to num) the print with a label
 * Generate an int b/w [20, 34] (assign to num) the print with a label
 * Generate an int b/w [-10, 9] (assign to num) the print with a label
 * Generate an double b/w [0, 1) (assign to val) the print with a label
 * Generate an double b/w [0, 6) (assign to val) the print with a label
 */

import java.util.Random;

public class RandomPractice {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println("Generate an int b/w [0, 9]: " + rand.nextInt(10));
        System.out.println("Generate an int b/w [1,10]: " + (rand.nextInt(10) + 1));
        System.out.println("Generate an int b/w [20, 34]: " + (rand.nextInt(15) + 20));
        System.out.println("Generate an int b/w [-10, 9]: " + (rand.nextInt(20) - 10));
        System.out.println("Generate an double b/w [0, 1): " + rand.nextDouble());
        System.out.println("Generate an double b/w [0, 6): " + (rand.nextDouble() * 6));
    }

}
