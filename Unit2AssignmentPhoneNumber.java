import java.util.Random;

public class Unit2AssignmentPhoneNumber {
    public static void main(String[] args){
        // initialize random numbers
        Random rand = new Random();
        int firstDigit = rand.nextInt(8) + 2;
        int secondDigit = rand.nextInt(9);
        int thirdDigit = rand.nextInt(10);
        int fourthDigit = rand.nextInt(8) + 2;
        int fifthSixthDigit = rand.nextInt(100);
        int lastDigits = rand.nextInt(10000);

        // print phone number
        System.out.println("Phone Number: (" + firstDigit + secondDigit + thirdDigit + ") - " + fourthDigit +
                fifthSixthDigit + " - " + lastDigits);
    }
}
