import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome!");
        //first one done outside of while loop to set all the variables
        System.out.print("Enter an expression with *, /, +, -, %, or ^: ");
        String userInput = scan.nextLine();
        Calculator calc = new Calculator(userInput);
        calc.printFinalDoubleOrInt();



        while (!userInput.equals("DONE")){
            System.out.print("Enter an expression with *, /, +, -, %, or ^(type DONE to stop): ");
            userInput = scan.nextLine();
            if (!userInput.equals("DONE")){
                calc = new Calculator(userInput);
                calc.printFinalDoubleOrInt();
            }
        }

        System.out.println("Goodbye!");

    }
}