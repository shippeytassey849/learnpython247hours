import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int num1 = rand.nextInt(10);
        int num2 = rand.nextInt(10);
        System.out.println("The numbers are " + num1 + " and " + num2);
    }
}