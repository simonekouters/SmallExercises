import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input an integer: ");
        int input = Integer.parseInt(scanner.nextLine());
        
        int sum = 0;
        
        while (input > 0) {
            sum += input % 10;
            input /= 10;
        }
        System.out.println("The sum of the digits is: " + sum);
    }
}