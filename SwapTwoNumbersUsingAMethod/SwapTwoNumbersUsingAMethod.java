import java.util.Scanner;

public class SwapTwoNumbersUsingAMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the value for a: ");
        int a = Integer.parseInt(scanner.nextLine());
        
        System.out.print("Enter the value for b: ");
        int b = Integer.parseInt(scanner.nextLine());
        
        Pair pair = new Pair(a, b);
        pair.swap();
        
        System.out.println("a is now: " + pair.getA());
        System.out.println("b is now: " + pair.getB());
    }
}