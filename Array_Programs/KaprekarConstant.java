//Kapr's Constant problem, also known ekaras theroblem, involves 6174 p a fascinating mathematical process. Given any four-digit number where at least two digits are different, you arrange its digits in descending and ascending order to form two new numbers. Then, subtract the smaller number from the larger. Repeat this process with the result, and you will eventually reach the number 6174, which is known as Kaprekar's Constant. 
import java.util.*;

public class KaprekarConstant {
    public static int countKaprekarSteps(int number) {
        int count = 0;
        while (number != 6174) {
            String numStr = Integer.toString( number);
            char[] digits = numStr.toCharArray();
            Arrays.sort(digits);
            int ascending = Integer.parseInt(new String(digits));
            int descending = Integer.parseInt(new StringBuilder(new String(digits)).reverse().toString());
            number = descending - ascending;
            count++;
            if (number == 0) {
                return -1; 
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a 4-digit number:");
        int number = scanner.nextInt();
        int steps = countKaprekarSteps(number);
        if (steps == -1) {
            System.out.println(" All digits are the same, No Kaprekar constant.");
        } else {
            System.out.println("Number of steps to reach 6174: " + steps);
        }
        
        scanner.close();
    }
}