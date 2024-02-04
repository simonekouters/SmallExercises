public class NotString {
    public static void main(String[] args) {
        System.out.println(notString("candy"));
        System.out.println(notString("x"));
        System.out.println(notString("not bad"));
    }
    
    private static String notString(String word) {
        if (word.length() >= 3 && word.startsWith("not")) {
            return word;
        } else {
            return "not " + word;
        }
    }
}