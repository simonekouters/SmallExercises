public class Has271 {
    public static void main(String[] args) {
        System.out.println(has271(new int[]{1, 2, 7, 1}));
        System.out.println(has271(new int[]{1, 2, 8, 1}));
        System.out.println(has271(new int[]{2, 7, 1}));
    }
    
    private static boolean has271(int[] array) {
        for (int i = 0; i < array.length - 2; i++) {
            if (array[i] == 2 && array[i + 1] == 7 && array[i + 2] == 1) {
                return true;
            }
        }
        return false;
    }
}