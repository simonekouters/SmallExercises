public class Diff21 {
    public static void main(String[] args) {
        System.out.println(diff21(19));
        System.out.println(diff21(10));
        System.out.println(diff21(21));
    }
    
    private static int diff21(int n) {
        if (n > 21) {
            return 2 * (n - 21);
        }
        return 21 - n;
    }
}