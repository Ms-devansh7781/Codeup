import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter String:");
        String input = scanner.nextLine();
        MyString string = new MyString(input);

        while (true) {
            System.out.println("\nEnter Operation you want to perform:");
            System.out.println("1. Append");
            System.out.println("2. Count Words");
            System.out.println("3. Replace");
            System.out.println("4. Check Palindrome");
            System.out.println("5. Splice");
            System.out.println("6. Split");
            System.out.println("7. Max Repeating Character");
            System.out.println("8. Sort");
            System.out.println("9. Shift");
            System.out.println("10. Reverse");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("Enter String to Append:");
                    String appendStr = scanner.nextLine();
                    string.append(appendStr);
                    System.out.println("Result: " + string);
                    break;

                case 2:
                    System.out.println("Word Count: " + string.countWords());
                    break;

                case 3:
                    System.out.println("Enter String to Replace:");
                    String oldStr = scanner.nextLine();
                    System.out.println("Enter New String:");
                    String newStr = scanner.nextLine();
                    string.replace(oldStr, newStr);
                    System.out.println("Result: " + string);
                    break;

                case 4:
                    System.out.println("Is Palindrome: " + string.isPalindrome());
                    break;

                case 5:
                    System.out.println("Enter Start Index:");
                    int start = scanner.nextInt();
                    System.out.println("Enter End Index:");
                    int end = scanner.nextInt();
                    int length = end - start;
                    System.out.println("Spliced String: " + string.splice(start, length));
                    break;

                case 6:
                    System.out.println("Enter Delimiter:");
                    String delimiter = scanner.nextLine();
                    String[] splitResult = string.split(delimiter);
                    System.out.println("Split Result: " + Arrays.toString(splitResult));
                    break;

                case 7:
                    System.out.println("Max Repeating Character: " + string.maxRepeat());
                    break;

                case 8:
                    string.sort();
                    System.out.println("Sorted String: " + string);
                    break;

                case 9:
                    System.out.println("Enter Shift Amount:");
                    int shiftAmount = scanner.nextInt();
                    string.shift(shiftAmount);
                    System.out.println("Shifted String: " + string);
                    break;

                case 10:
                    string.reverse();
                    System.out.println("Reversed String: " + string);
                    break;

                case 0:
                    System.out.println("Exiting");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
