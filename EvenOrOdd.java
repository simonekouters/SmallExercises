import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine()); 
        
        int answer = input % 2 == 0 ? 1 : 0;
        System.out.println(answer);
        
    }
}