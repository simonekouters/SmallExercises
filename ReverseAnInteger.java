import java.util.Scanner;

public class ReverseAnInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        
        String number = scanner.nextLine();
        System.out.println(reverseInteger(number));
    }
    
    private static String reverseInteger(String number) {
        StringBuilder builder = new StringBuilder(number);
        builder.reverse();
        return builder.toString();
    }
}