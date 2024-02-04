import java.util.Scanner;
import java.lang.Character;

public class CountLettersSpacesNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        
        String text = scanner.nextLine();
        char[] ch = text.toCharArray();
        
        int letters = 0;
        int spaces = 0;
        int digits = 0;
        int other = 0;
        
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(ch[i])) {
                letters++;
            } else if (Character.isDigit(ch[i])) {
                digits++;
            } else if (Character.isSpaceChar(ch[i])) {
                spaces++;
            } else {
                other++;
            }
        }
        
        System.out.println("letters: " + letters);
        System.out.println("spaces: " + spaces);
        System.out.println("digits: " + digits);
        System.out.println("other: " + other);
    }   
}