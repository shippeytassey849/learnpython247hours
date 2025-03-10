import java.util.Random;

public class RandomCode {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(100);
        System.out.println("The random number is: " + randomNumber);
    }
}
