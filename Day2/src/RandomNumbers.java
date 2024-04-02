import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {

        Random random = new Random();

        // int x = random.nextInt(6)+1; // will generate a random number between 0 and given parameter

        // double x = random.nextDouble(); // will generate a random number between 0 and 1

        boolean x = random.nextBoolean(); // will generate random boolean

        System.out.println(x);

    }
}