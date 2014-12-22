/**
 * Question 1.5: Implement a method to perform basic string compression using the counts of repeated characters. For
 * example, the string aabcccccaaa would become a2b1c5a3. If the "compressed" string would not become smaller than the
 * original string, your method should return the original string. You can assume the string has only upper and lower
 * case letters (a-z).
 */

public class StringCompression {

    public static String stringCompress(String str) {
        StringBuffer result = new StringBuffer();
        int countRepeat = 1;
        for (int i = 0; i < str.length(); i++) {
            if (i == str.length() - 1) { // If last character of string is reached, append
                result.append(str.charAt(i));
                result.append(countRepeat);
                break;
            }
            if (str.charAt(i) == str.charAt(i + 1)) { // Compare current and next character
                countRepeat++;
            } else {
                result.append(str.charAt(i));
                result.append(countRepeat);
                countRepeat = 1;
            }
        }
        return result.toString().length() <= str.length() ? result.toString() : str;
    }

    public static void main(String[] args) {
        System.out.println(stringCompress("aabcccccaaa")); // Return compressed string
        System.out.println(stringCompress("aabcccccaab")); // Return compressed string
        System.out.println(stringCompress("aabbccdd")); // Return compressed string
        System.out.println(stringCompress("abcd")); // Return original string
    }
}
