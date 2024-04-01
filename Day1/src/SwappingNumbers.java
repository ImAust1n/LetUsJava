public class SwappingNumbers {

    public static void main(String[] args){

        String x = "water";

        String y = "cool-aid";

        System.out.println("x: "+x);

        System.out.println("y: "+y);

        String temp;

        temp = x;
        x = y;
        y = temp;

        System.out.println("x: "+x);

        System.out.println("y: "+y);

    }
}
