public class ArrayFront9 {
    public static void main(String[] args) {
        System.out.println(arrayFront9(new int[]{1, 2, 9, 3, 4}));
        System.out.println(arrayFront9(new int[]{1, 2, 3, 4, 9}));
        System.out.println(arrayFront9(new int[]{1, 2, 3, 4, 5}));
    }
    
    private static boolean arrayFront9(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i < 4 && array[i] == 9) {
                return true;
            }
        }
        return false;
    }  
}