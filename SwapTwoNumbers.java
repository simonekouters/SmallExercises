import java.util.Scanner;

public class SwapToNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value for a: ");
        int a = Integer.parseInt(scanner.nextLine());
        
        System.out.print("Enter the value for b: ");
        int b = Integer.parseInt(scanner.nextLine());
        
        a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.println("a is now: " + a);
        System.out.println("b is now: " + b);
    }
}