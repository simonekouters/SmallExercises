public class Last2 {
    public static void main(String[] args) {
        System.out.println(last2("hixxhi"));
        System.out.println(last2("xaxxaxaxx"));
        System.out.println(last2("axxxaaxx"));
    }
    
    private static int last2(String text) {
        if (text.length() < 2) {
            return 0;
        }            
        
        int count = 0;   
        
        String end = text.substring(text.length() - 2, text.length());
        
        for (int i = 0; i < text.length() - 2; i++) {
            if (text.substring(i, i + 2).equals(end)) {
                count++;
            }
        }
        return count;
    }
}
