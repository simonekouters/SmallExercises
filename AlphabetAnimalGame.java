import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class AlphabetAnimalGame {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        addAnimals();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Name an animal: ");
        String animalName = scanner.nextLine();
        
        char lastLetter = animalName.charAt(animalName.length() - 1);
        
        boolean found = false;
        
        for (String animal : animals) {
            if (animal.charAt(0) == lastLetter) {
                System.out.println(animal);
                System.exit(0);
                found = true;
            }
        }
        
        if (!found) {
            System.out.println("I don't know any animal whose name starts with '" + lastLetter + "'. You win!");
        }
    }
    
    private static void addAnimals() {
        animals.add("ant");
        animals.add("beaver");
        animals.add("crocodile");
        animals.add("dog");
        animals.add("elephant");
        animals.add("fox");
        animals.add("goat");
        animals.add("horse");
        animals.add("ibis");
        animals.add("jellyfish");
        animals.add("kangaroo");
        animals.add("leopard");
        animals.add("moose");
    }
}