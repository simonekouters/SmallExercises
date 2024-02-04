import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.print(fizzBuzz(i) + " ");
        }              
    }
     private static String fizzBuzz(int number) {
        String result = "";
        if (number % 3 == 0) {
            result += "Fizz";
        }
        if (number % 5 == 0) {
            result += "Buzz";
        }
        if (result.isEmpty()) {
            result += number;
        }
        return result;
     }
}