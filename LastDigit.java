public class LastDigit {
    public static void main(String[] args) {
        System.out.println(lastDigit(7, 17));
        System.out.println(lastDigit(6, 17));
        System.out.println(lastDigit(3, 113));
    }
    
    public static boolean lastDigit(int number1, int number2) {
        return number1 % 10 == number2 % 10;
    }
}