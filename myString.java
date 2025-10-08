public class MyString {

    private String value = "MyString";

    public MyString(String value) {
        this.value = value;
    }

    public String append(String str) {
        this.value += str;
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
        String result = "";
        int i = 0;
        while (i < this.value.length()) {
            if (i + oldStr.length() <= this.value.length() &&
                value.substring(i, i + oldStr.length()).equals(oldStr)) {
                result += newStr;
                i += oldStr.length();
            } else {
                result += this.value.charAt(i);
                i++;
            }
        }
       this.value = result;
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
            freq[value.charAt(i)]++;
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
        int count = 0;

        for (int i = 0; i <= this.value.length() - pattern.length(); ) {
            boolean match = true;
            for (int j = 0; j < pattern.length(); j++) {
                if (this.value.charAt(i + j) != pattern.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                count++;
                i += pattern.length();
            } else {
                i++;
            }
        }

        String[] parts = new String[count + 1];
        int partIndex = 0;
        String temp = "";
        for (int i = 0; i < this.value.length(); ) {
            boolean match = true;
            if (i + pattern.length() <= this.value.length()) {
                for (int j = 0; j < pattern.length(); j++) {
                    if (this.value.charAt(i + j) != pattern.charAt(j)) {
                        match = false;
                        break;
                    }
                }
            } else {
                match = false;
            }

            if (match) {
                parts[partIndex++] = temp;
                temp = "";
                i += pattern.length();
            } else {
                temp += this.value.charAt(i);
                i++;
            }
        }
        parts[partIndex] = temp;
        return parts;
    }

    public String splice(int start, int length) {
        if (start < 0 || start >= this.value.length() || length < 0 || start + length > this.value.length())
            return value;

        String result = "";
        for (int i = 0; i < this.value.length(); i++) {
            if (i < start || i >= start + length) {
                result += this.value.charAt(i);
            }
        }
        this.value = result;
        return this.value;
    }

    public String sort() {
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
        char[] chars = this.value.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        this.value = new String(chars);
        return this.value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
