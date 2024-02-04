import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(factorial(number));
    }
    
    private static int factorial(int number) {
        int sum = 1;
        
        for (int i = 1; i <= number; i++) {
            sum *= i;
        }
        return sum;
    }
}