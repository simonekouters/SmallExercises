public class StringSPlosion {
    public static void main(String[] args) {
        System.out.println(stringSplosion("Code"));
        System.out.println(stringSplosion("abc"));
        System.out.println(stringSplosion("ab"));
    }
    
    private static String stringSplosion(String text) {
        String result = "";
        
        for (int i = 0; i < text.length(); i++) {
            result += text.substring(0, i + 1);
        }
        return result;
    }
}