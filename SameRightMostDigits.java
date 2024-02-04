import java.util.Scanner;

public class SameRightMostDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input the first number: ");
        int first = Integer.parseInt(scanner.nextLine());
        
        System.out.print("Input the second number: ");
        int second = Integer.parseInt(scanner.nextLine());
        
        System.out.print("In the third number: ");
        int third = Integer.valueOf(scanner.nextLine());
        
        System.out.println("The result is: " + sameRightDigits(first, second, third));
    }
    
    private static boolean sameRightDigits(int first, int second, int third) {
        return first % 10 == second % 10 || 
                first % 10 == third % 10 ||
                second % 10 == third % 10;   
    }
}