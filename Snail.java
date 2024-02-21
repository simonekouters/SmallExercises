import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Snail {
    public static void main(String[] args) {
        // int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] array = {{1, 2, 3, 4}, {5, 6, 7, 8}, {1, 2, 3, 4}, {5, 6, 7, 8}};
        int length = array.length;
        int[][] snail = new int[length][length];

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                numbers.add(array[i][j]);
            }
        }

        int num = 0;
        int top = 0;
        int bottom = length - 1;
        int left = 0;
        int right = length - 1;

        for (int i = 0; i < length; i++) {
            for (int y = left; y <= right; y++) {
                snail[top][y] = numbers.get(num);
                num++;
            }
            top++;

            for (int x = top; x <= bottom; x++) {
                snail[x][right] = numbers.get(num);
                num++;
            }
            right--;

            for (int y = right; y >= left; y--) {
                snail[bottom][y] = numbers.get(num);
                num++;
            }
            bottom--;

            for (int x = bottom; x >= top; x--) {
                snail[x][left] = numbers.get(num);
                num++;
            }
            left++;
        }

        for (int[] row : snail) {
            System.out.println(Arrays.toString(row));
        }
    }
}





