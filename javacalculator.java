import java.util.Scanner;

public class javacalculator {
    public static void main(String[] args) {
        
        Scanner calculator = new Scanner(System.in);

        while (true) {
            System.out.print("+, -, *, /, exit: ");
            String name = calculator.nextLine();

            if(name.equals("exit")){
                System.out.println("Exiting the calculator.");
                System.exit(0);
            }

            System.out.print("Enter your first number: ");
            int num1 = calculator.nextInt();

            System.out.print("Enter your second number: ");
            int num2 = calculator.nextInt();


            calculator.nextLine();

            if(name.equals("+")){
                System.out.println(num1 + num2);
            }
            else if(name.equals("-")){
                System.out.println(num1 - num2);
            }
            else if(name.equals("*")){
                System.out.println(num1 * num2);
            }
            else if(name.equals("/")){
                if(num2 != 0) {
                    System.out.println(num1 / num2);
                }
                else {
                    System.out.println("Division by zero is not allowed.");
                }
            }
            else {
                System.out.println("Invalid, try again.");
            }

            System.out.print("Do you want to perform another calculation?");
            String continueChoice = calculator.nextLine();

            if(continueChoice.equalsIgnoreCase("no")) {
                System.out.println("Bye!");
                break;
            }
        }
    }
}
