import java.util.ArrayList;

public class MyString {

    private String value = "MyString";

    public MyString(String value) {
        this.value = value;
    }
	
    public String append(String value) {
        this.value += value;
        return this.value;
    }

    public int countWords() {
        int words = 0;
        boolean inWord = false;
        for (int i = 0; i < this.value.length(); i++) {
            char ch = this.value.charAt(i);
            if (ch != ' ' && ch != '\t') {
                if (!inWord) {
                    words++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }
        return words;
    }

  
    public String replace(String oldStr, String newStr) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < this.value.length()) {
            if (i + oldStr.length() <= this.value.length() &&
                this.value.substring(i, i + oldStr.length()).equals(oldStr)) {
                result.append(newStr);
                i += oldStr.length();
            } else {
                result.append(this.value.charAt(i));
                i++;
            }
        }
        this.value = result.toString();
        return this.value;
    }


    public boolean isPalindrome() {
        for (int i = 0, j = this.value.length() - 1; i < j; i++, j--) {
            if (Character.toLowerCase(this.value.charAt(i)) != Character.toLowerCase(this.value.charAt(j))) {
                return false;
            }
        }
        return true;
    }

  
    public char maxRepeat() {
        int[] freq = new int[256];
        for (int i = 0; i < this.value.length(); i++) {
            freq[this.value.charAt(i)]++;
        }
        int max = 0;
        char maxCh = ' ';
        for (int i = 0; i < 256; i++) {
            if (freq[i] > max) {
                max = freq[i];
                maxCh = (char) i;
            }
        }
        return maxCh;
    }


    public String[] split(String pattern) {
        ArrayList<String> list = new ArrayList<>();
        int i = 0;
        String str = "";
        while (i <= this.value.length() - pattern.length()) {
            boolean match = true;
            for (int j = 0; j < pattern.length(); j++) {
                if (pattern.charAt(j) != this.value.charAt(i + j)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                list.add(str);
                str = "";
                i += pattern.length();
            } else {
                str += this.value.charAt(i);
                i++;
            }
        }
        while (i < this.value.length()) {
            str += this.value.charAt(i++);
        }
        list.add(str);
        return list.toArray(new String[0]);
    }


    public String splice(int start, int length) {
        if (start < 0 || start >= value.length() || length < 0 || start + length > value.length())
            return this.value;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < value.length(); i++) {
            if (i < start || i >= start + length) {
                sb.append(value.charAt(i));
            }
        }
        this.value = sb.toString();
        return this.value;
    }


    public String sort() {
        if (this.value.length() <= 1) return this.value;

        char[] chars = this.value.toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            for (int j = 0; j < chars.length - 1 - i; j++) {
                if (chars[j] > chars[j + 1]) {
                    char temp = chars[j];
                    chars[j] = chars[j + 1];
                    chars[j + 1] = temp;
                }
            }
        }
        this.value = new String(chars);
        return this.value;
    }


    public String shift(int n) {
        if (this.value.length() <= 1) return this.value;
        n = n % this.value.length();
        if (n <= 0) return this.value;

        this.value = this.value.substring(n) + this.value.substring(0, n);
        return this.value;
    }


    public String reverse() {
        StringBuilder sb = new StringBuilder(this.value);
        this.value = sb.reverse().toString();
        return this.value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
