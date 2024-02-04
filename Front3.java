public class Front3 {
    public static void main(String[] args) {
        System.out.println(front3("Java"));
        System.out.println(front3("Chocolate"));
        System.out.println(front3("abc"));
    }
    
    private static String front3(String text) {
        String front = text.substring(0, 3);
     
        String result = text.length() <= 3 ? text + text + text : front + front + front;
        return result;
    }
}