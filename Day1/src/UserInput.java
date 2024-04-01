import java.util.Scanner; // import scanner to take user defined input

public class UserInput {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your name? ");
        String name = scanner.nextLine();

        System.out.println("How old are you? ");
        int age = scanner.nextInt();

        scanner.nextLine(); // just to clean the scanner because previous input is integer

        System.out.println("What's your favorite food? ");
        String food = scanner.nextLine();


        System.out.println("Hello "+name+"!");
        System.out.println("You are "+age+" years old!");
        System.out.println("You like "+food+" very much!");

        scanner.close();

    }

}
