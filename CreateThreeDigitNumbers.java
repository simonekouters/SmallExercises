public class CreateThreeDigitNumbers {
    public static void main(String[] args) {
        int count = 0;
        
        for (int firstDigit = 1; firstDigit <= 4; firstDigit++) {
            for (int secondDigit = 1; secondDigit <= 4; secondDigit++) {
                for (int thirdDigit = 1; thirdDigit <= 4; thirdDigit++) {
                    if (firstDigit != secondDigit && firstDigit != thirdDigit && secondDigit != thirdDigit) {
                        System.out.printf("%d%d%d%n", firstDigit, secondDigit, thirdDigit); 
                        count++;
                    }
                }
            }
        }
        System.out.print("Total number of three-digit-numbers is " + count);
    }
}
