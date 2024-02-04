public class StringX {
    public static void main(String[] args) {
        System.out.println(stringX("xxHxix"));
        System.out.println(stringX("abxxxcd"));
        System.out.println(stringX("xabxxxcdx"));
    }
    
    private static String stringX(String text) {
        String result = "";
        
        for (int i = 0; i < text.length(); i++) {
            if (!(i > 0 && i < text.length() - 1 && text.charAt(i) == 'x')) {
                result += text.charAt(i);
            }
        }
        return result;
    }
}