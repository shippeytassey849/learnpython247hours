import java.util.Random;

public class RandomCode {
    public static void main(String[] args) {
        int randNum = new Random().nextInt(10);
        System.out.println("Random number: " + randNum);
    }
}
