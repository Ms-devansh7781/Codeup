import java.util.*;

public class Main {
    public static void main(String[] args) {
        
      System.out.println("Enter String");
      Scanner scanner = new Scanner(System.in);
      String input = scanner.nextLine();
      MyString string = new MyString(input);
      System.out.println(string);

    System.out.println("Enter Operation you want to perform");
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
    System.out.println();
    while(true){
        switch(choice){
            case 1:
                System.out.println("Enter String to Append");
                String appendStr = scanner.next();
                string.append(appendStr);
                System.out.println("Result: " + string);
                break;
            case 2:
                int wordCount = string.countWords();
                System.out.println("Word Count: " + wordCount);
                break;
            case 3;
                System.out.println("Enter String to Replace");
                String oldStr = scanner.next();
                System.out.println("Enter New String");
                String newStr = scanner.next();
                string.replace(oldStr, newStr);
                System.out.println("Result: " + string);
                break;
            case 4:
                boolean isPalin = string.isPalindrome();
                System.out.println("Is Palindrome: " + isPalin);
                break;
            case 5:
                System.out.println("Enter Start Index");
                int start = scanner.nextInt();
                System.out.println("Enter End Index");
                int end = scanner.nextInt();
                String spliced = string.splice(start, end);
                System.out.println("Spliced String: " + spliced);
                break;
            case 6:
                System.out.println("Enter Delimiter");
                String delimiter = scanner.next();
                ArrayList<String> splitList = string.split(delimiter);
                System.out.println("Split Result: " + splitList);
                break;
            case 7:
                char maxChar = string.maxRepeatingChar();
                System.out.println("Max Repeating Character: " + maxChar);
                break;
            case 8:
                string.sort();
                System.out.println("Sorted String: " + string);
                break;
            case 9:
                System.out.println("Enter Shift Amount");
                int shiftAmount = scanner.nextInt();
                string.shift(shiftAmount);
                System.out.println("Shifted String: " + string);
                break;
            case 10:
                string.reverse();
                System.out.println("Reversed String: " + string);
                break;
            case 0:
                System.out.println("Exiting...");
                return;
            default:
                System.out.println("Invalid Choice");
    }

    }
}
