import java.util.Arrays;

public class Snail {
    public static void main(String[] args) {
        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
        
        int[] array1 = array[0];
        int[] array2 = array[1];
        int[] array3 = array[2];
        
        swap(array2, array2, 0, 2);
        swap(array2, array3, 1, 2);
        swap(array2, array3, 0, 1);
        
        printArray(array);
    }
    
    private static void swap(int[] firstArray, int[] secondArray, int index1, int index2) {
        int temp = firstArray[index1];
        firstArray[index1] = secondArray[index2];
        secondArray[index2] = temp;
    }
    
    private static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));  
        }
    }
}