public class StartOz {
    public static void main(String[] args) {
        System.out.println(startOz("ozymandias"));
        System.out.println(startOz("bzoo"));
        System.out.println(startOz("oxx"));
    }
    
    private static String startOz(String text) {
        String result = "";
        
        if (text.startsWith("o")) {
            result += "o";
        }
        if (text.startsWith("z", 1)) {
            result += "z";
        }        
        return result;
    }
}