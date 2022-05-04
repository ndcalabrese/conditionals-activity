import java.util.Scanner;

public class SameOrNah {

    public static void main(String[] args) {

        compareWords(getUserInput());

    }

    public static String[] getUserInput() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");

        String word1 = scanner.nextLine();

        System.out.print("Enter another word: ");

        String word2 = scanner.nextLine();

        return new String[] {word1, word2};

    }

    public static void compareWords (String[] words) {

        if (words[0].equals(words[1])) {

            System.out.println("The words are the same.");

        } else {

            System.out.println("The words are different.");

        }

    }

}
