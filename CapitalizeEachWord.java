import java.util.Scanner;

public class CapitalizeEachWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input a sentence: " );
        String sentence = scanner.nextLine();
        
        String[] parts = sentence.split(" ");
        
        StringBuilder builder = new StringBuilder();
        
        for (int i = 0; i < parts.length; i++) {
            builder.append(parts[i].substring(0,1).toUpperCase());
            builder.append(parts[i].substring(1));
            builder.append(" ");
        }
        System.out.println(builder);
    }
}