import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class LearningAnimalGame {
    private static Scanner scanner = new Scanner(System.in);
    private static List<String> animals = new ArrayList<>(List.of("ant", "beaver", "crocodile", "dog", "elephant", "fox")); 

    public static void main(String[] args) {
        do {
            playGame();
            System.out.print("Do you want to play again? ");
            String answer = scanner.nextLine();
            if (answer.equals("no")) {
                break;
            }
        } while (true);
        System.out.println("Thank you for playing!"); 
    }
    
    private static void playGame() {
        System.out.print("Name an animal: ");
        
        do { 
            String animalName = scanner.nextLine();
            
            char lastLetter = animalName.charAt(animalName.length() - 1);
            
            boolean found = false;
        
            for (String animal : animals) {
                if (animal.charAt(0) == lastLetter) {
                    System.out.println(animal + "!");
                    System.out.print("Your turn! ");
                    lastLetter = animal.charAt(animal.length() - 1);
                    found = true;
                }
            }
            if (!found) {
                System.out.println("I don't know any animal whose name starts with '" + lastLetter + "'. You win!");
                askAnimalForList(lastLetter);
                break;
            }
        } while (true);
    }
    
    private static void askAnimalForList(char firstLetter) {
        System.out.print("What would have been a good answer? ");
        String answer = scanner.nextLine();
        animals.add(answer);  
    }
}