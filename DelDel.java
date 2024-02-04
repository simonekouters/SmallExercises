public class DelDel {
    public static void main(String[] args) {
        System.out.println(delDel("adelbc"));
        System.out.println(delDel("adelHello"));
        System.out.println(delDel("adedbc"));        
    }
    
    private static String delDel(String text) {
        String newText = "";
        
        if (text.startsWith("del", 1)) {
            newText = text.replace("del", "");
            return newText;
        } 
        return text;
    }
}