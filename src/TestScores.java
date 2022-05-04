import java.util.Scanner;

public class TestScores {

    public static void main(String[] args) {

        System.out.println("Your grade is a" + checkGrade(getUserInput()));

    }

    public static double getUserInput() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Name a number between 0 and 100: ");

        return Double.parseDouble(scanner.nextLine());

    }

    public static String checkGrade(double userInput) {

        String grade;

        if (userInput < 60 ) {

            grade = "n F :(";

        } else if (userInput < 70) {

            grade = " D :\\";

        } else if (userInput < 80) {

            grade = " C :|";

        } else if (userInput < 90) {

            grade = " B :)";

        } else if (userInput < 100) {

            grade = "n A :D";

        } else {

            grade = "n A+ :O";

        }

        return grade;

    }

}
