public class CountXX {
    public static void main(String[] args) {
        System.out.println(countX("abcxx"));
        System.out.println(countX("xxx"));
        System.out.println(countX("xxxx"));
    }
    
    private static int countX(String text) {
        int count = 0;
        
        for (int i = 0; i < text.length() - 1; i++) {
            if (text.charAt(i) == 'x' && text.charAt(i + 1) == 'x') {
                count++;
            }
        }
        return count;
    }
}