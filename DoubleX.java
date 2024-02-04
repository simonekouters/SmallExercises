public class DoubleX {
    public static void main(String[] args) {
        System.out.println(doubleX("axxbb"));
        System.out.println(doubleX("axaxax"));
        System.out.println(doubleX("xxxxx"));
    }
    
    private static boolean doubleX(String text) {
        for (int i = 0; i < text.length() - 1; i++) {
            if (text.charAt(i) == 'x') {
                if (text.charAt(i + 1) == 'x') {
                    return true;
                }
            }
        }
        return false;
    }
}