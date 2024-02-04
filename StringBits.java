public class StringBits {
    public static void main(String[] args) {
        System.out.println(stringBits("Hello"));
        System.out.println(stringBits("Hi"));
        System.out.println(stringBits("Heeololeo"));
    }
    
    private static String stringBits(String text) {
        StringBuilder builder = new StringBuilder();
        
        for (int i = 0; i < text.length(); i +=  2) {
            builder.append(text.charAt(i));
        }
        return builder.toString();
    }
}