public class Snail1 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] snail = new int[array.length][array.length];
        
        int number = 1;
        int move = 1;
        int row = 0;
        int column = -1; 
        int length = snail.length;
        
        for (int i = 0; i < snail.length; i++) {
            for (int j = 0; j < length; j++) {
                column += move;
                snail[row][column] = number++;
            }
            length--;
            for (int j = 0; j < length; j++) {
                row += move;
                snail[row][column] = number++;
            }
            move *= -1;
        }
        
        
        for (int i = 0; i < snail.length; i++) {
            for (int j = 0; j < snail[i].length; j++) {
                System.out.print(snail[i][j] + " ");
            }
            System.out.println();
        }
    }
}