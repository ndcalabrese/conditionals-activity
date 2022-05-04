import java.util.Scanner;

public class NumberComparison {

    public static void main(String[] args) {

        checkUserInput(getUserInput());

    }

    public static double[] getUserInput() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");

        double num1 = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter another number: ");

        double num2 = Double.parseDouble(scanner.nextLine());

        return new double[] {num1, num2};

    }

    public static void checkUserInput(double[] numbers) {

        if (numbers[0] == numbers[1]) {

            System.out.println("Numbers are the same");

        } else if (numbers[0] > numbers [1]) {

            System.out.println("The first number was larger than the second.");

        } else {

            System.out.println("The second number was larger than the first.");

        }

    }

}
