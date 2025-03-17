import java.util.Random;

public class RandomNumberGen {
    public static void main(String[] args) {
        // Initialize random number generator
        Random rand = new Random();

        // Generate a random integer between 1 and 100
        int randNum = rand.nextInt(100) + 1;

        System.out.println("Random number: " + randNum);
    }
}
