/**
 *
 */
public class Geometry {
    public static void main(String[] args) {
        int sides = 7;
        int radius = 5;
        final double PI = 3.14159265359;
        System.out.println("A heptagon has " + sides + " sides.");
        System.out.println("A decagon has " + 2 * radius + " sides.");
        System.out.println("A dodecagon has " + (radius + sides) + " sides.");
        System.out.println("The circumfrence of a circle with a radius of " + radius + " is " + (2*PI*radius));
    }
}
