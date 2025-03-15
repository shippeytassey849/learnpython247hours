import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        // Create a new Random object
        Random random = new Random();

        // Generate a random number between 1 and 10
        int randomNumber = random.nextInt(10) + 1;

        System.out.println("Random Number: " + randomNumber);
    }
}