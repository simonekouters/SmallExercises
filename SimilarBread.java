public class SimilarBread {
    public static void main(String[] args) {
        System.out.println(hasSameBread(new String[]{"white bread", "lettuce", "white bread"},
        new String[]{"white bread", "tomato", "white bread"}));
        
        System.out.println(hasSameBread(new String[]{"brown bread", "chicken", "brown bread"},
        new String[]{"white bread", "chicken", "white bread"}));
        
        System.out.println(hasSameBread(new String[]{"toast", "cheese", "toast"},
        new String[]{"brown bread", "cheese", "toast"}));
    }
    
    private static boolean hasSameBread(String[] sandwich1, String[] sandwich2) {
        return sandwich1[0].equals(sandwich2[0]) && sandwich1[2].equals(sandwich2[2]);
    }
}