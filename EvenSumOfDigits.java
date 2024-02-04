public class EvenSumOfDiguts {
    public static void main(String[] args) {
        
        for (int i = 100; i < 150; i++) {
             if (((i % 100 / 10) + i % 10 + 1) % 2 == 0) {
                System.out.println(i);
            } 
        }     
    }
}