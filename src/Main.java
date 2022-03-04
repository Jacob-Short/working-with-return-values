import java.util.Scanner;

public class Main {

    // Let's refactor this to utilize and work with return statements

    // Step One: Alter each method's return type from 'void' -> 'int'
    // Step Two: return the result in each method as opposed to printing the result
    //   - this way we have access to that variable in our main method

    public static void add(int a, int b) {
        int result = a + b;
        System.out.println(result);
    }

    public static void subtract(int a, int b) {
        int result = a - b;
        System.out.println(result);
    }

    public static void multiply(int a, int b) {
        int result = a * b;
        System.out.println(result);
    }

    public static void divide(int a, int b) {
        int result = a / b;
        System.out.println(result);
    }

    public static void main(String[] args) {

        System.out.println("Hello and Welcome to My Calculator Application! :)");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please select which type of operation you would like to conduct. [add, subtract, multiply, divide] ");
        String operation = sc.nextLine();

        System.out.println("Now please choose your first number.");
        int firstNum = sc.nextInt();

        System.out.println("Now please choose your second number.");
        int secondNum = sc.nextInt();

        // Step 3: initialize a 'result' variable of type int
        // Step 4: Within switch statement, set the result to the return value of the method
        //     - we now have access to that variable within main and can either print it
        //       or do other things with it, send it to other methods or do some more code in
        //       the main on that variable

        switch (operation) {
            case "add" -> add(firstNum, secondNum);
            case "subtract" -> subtract(firstNum, secondNum);
            case "multiply" -> multiply(firstNum, secondNum);
            case "divide" -> divide(firstNum, secondNum);
            default -> System.out.println("You are attempting to do some calculations that are outside of my control :(");
        }

        // Step 5: Print the result in the main method
        // Step 6: Lastly, uncomment the if / else statement to print
        //         if the result is even or odd

//        if (result % 2 == 0) {
//            System.out.println("Result is even!");
//        }
//        else {
//            System.out.println("Result is odd!");
//        }
    }
}
