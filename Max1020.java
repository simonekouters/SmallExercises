public class Max1020 {
    public static void main(String[] args) {
        System.out.println(max1020(11, 19));
        System.out.println(max1020(19, 11));
        System.out.println(max1020(11, 9));
    }
    
    private static int max1020(int a, int b) {
        if (b > a) {
            a = b;
        }
        if (a >= 10 && a <= 20) {
            return a;
        } else if (b >= 10 && b <= 20) {
            return b;
        } else {
            return 0;
        }
    }
}