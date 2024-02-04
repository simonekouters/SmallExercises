public class Close10 {
    public static void main(String[] args) {
        System.out.println(close10(8, 13));
        System.out.println(close10(13, 8));
        System.out.println(close10(13, 7));
    }
    
    private static int close10(int number1, int number2) {
        if (Math.abs(10 - number1) < Math.abs(10 - number2)) {
            return number1;
        } else if (Math.abs(10 - number1) > Math.abs(10 - number2)) {
            return number2;
        } else {
            return 0;
        }
    }
}