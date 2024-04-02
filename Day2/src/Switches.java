public class Switches {

    public static void main(String[] args){

        // switch

        String day = "Monday";

        switch (day){
            case "Sunday":
                System.out.println("It's sunday!");
                break;

            case "Monday":
                System.out.println("It's monday!");
                break;

            case "Tuesday":
                System.out.println("It's tuesday!");
                break;

            case "Wednesday":
                System.out.println("It's wednesday!");
                break;

            case "Thussday":
                System.out.println("It's thursday!");
                break;

            case "Friday":
                System.out.println("It's friday!");
                break;

            case "Saturday":
                System.out.println("It's saturday!");
                break;

            default:
                System.out.println("That's not a day!");
        }

    }

}
