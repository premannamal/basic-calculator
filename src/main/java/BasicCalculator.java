import java.util.*;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first number");
        int num1 = scanner.nextInt();
        System.out.println("Please enter the second number");
        int num2 = scanner.nextInt();

        // Consume the leftover newline character from nextInt()

        scanner.nextLine();

        System.out.println("What do you want to do? ");
        System.out.print("Possible calculations:");
        System.out.print("(A)dd");
        System.out.print("(S)ubtract");
        System.out.print("(M)ultiply");
        System.out.print("(D)ivide");
        System.out.print("Please select an option");
        String operation = scanner.nextLine();

        int result = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + result);


    }


}
