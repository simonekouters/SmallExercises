import java.util.Scanner;

public class Front22 {
    public static void main(String[] args) {
        System.out.println(front22("kitten"));
        System.out.println(front22("Ha"));
        System.out.println(front22("abc"));
        System.out.println(front22("a"));
        System.out.println(front22(" "));
    }
    
    private static String front22(String word) {
        int length = Math.min(word.length(), 2);
        String front = word.substring(0, length);
        return front + word + front;
    }
}