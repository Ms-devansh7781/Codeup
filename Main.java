public class Main {
    public static void main(String[] args) {
        MyString s = new MyString("Devansh");
        System.out.println(s);          // Devansh
        s.append(" Sharma");
        System.out.println(s);          // Devansh Sharma

        System.out.println("Words: " + s.countWords());        // 2
        System.out.println("Reversed: " + s.reverse());       // amrahS hsnaveD
        System.out.println("Shift 3: " + s.shift(3));         // rahS hsnaveDDev
        System.out.println("Sorted: " + s.sort());            //      DEDSahhnrrv
        System.out.println("Palindrome? " + s.isPalindrome()); // false
        System.out.println("Max repeating char: " + s.maxRepeat());
        
        String[] parts = s.split(" "); // split by space
        System.out.println("Split:");
        for (String p : parts) System.out.println(p);
        
        System.out.println("Splice: " + s.splice(0, 5)); // removes first 5 characters
    }
}
