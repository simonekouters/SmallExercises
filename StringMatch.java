public class StringMatch {
    public static void main(String[] args) {
        System.out.println(stringMatch("xxcaazz", "xxbaaz"));
        System.out.println(stringMatch("abc", "abc"));
        System.out.println(stringMatch("abc", "axc"));
    }
    
    private static int stringMatch(String first, String second) {
        String shortest = first.length() < second.length() ? first : second;
        
        int length = Math.min(first.length(), second.length());
        int count = 0;
        
        for (int i = 0; i < length - 1; i++) {
            if (first.charAt(i) == second.charAt(i) && first.charAt(i + 1) == second.charAt(i + 1)) {
                count++;
            }
        }
        return count;
    }
}