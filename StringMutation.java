/**
 * Play with Strings
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringMutation
{
    public static void main(String[] args)
    {
        String phrase = "Change is inevitable";
        System.out.println(phrase);
        int phraseLength = phrase.length();
        System.out.println("Length of phrase = " + phraseLength);
        String mut1, mut2, mut3, mut4;

        mut1 = phrase + ", except from vending machines.";
        System.out.println("mut1: " + mut1);
        System.out.println("Length of mut1 = " + mut1.length());

        mut2 = mut1.toUpperCase();
        System.out.println("mut2: " + mut2);
        System.out.println("Length of mut2 = " + mut2.length());

        mut3 = mut2.replace('E', 'X');
        System.out.println("mut3: " + mut3);
        System.out.println("Length of mut3 = " + mut3.length());

        mut4 = mut3.substring(mut3.indexOf('N'), mut3.indexOf('F') + 1);
        System.out.println("mut4: " + mut4);
        System.out.println("Length of mut4 = " + mut4.length());

    }
} 
    