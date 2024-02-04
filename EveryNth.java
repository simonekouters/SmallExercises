public class EveryNth {
    public static void main(String[] args) {
        System.out.println(everyNth("Miracle", 2));
        System.out.println(everyNth("abcdefg", 2));
        System.out.println(everyNth("abcdefg", 3));        
    }
    
    private static String everyNth(String text, int n) {
        String result = "";
        
        for (int i = 0; i < text.length(); i++) {
            if (i % n == 0) {
                result += text.charAt(i);
            }
        }
        return result;
    }
}