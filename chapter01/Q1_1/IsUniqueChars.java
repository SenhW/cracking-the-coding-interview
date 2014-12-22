import java.util.HashSet;
import java.util.Set;

/**
 * Question 1.1: Implement an algorithm to determine if a string has all unique characters. What if you cannot use
 * additional data structures?
 */

public class IsUniqueChars {

    public static boolean isUniqueChars(String string) {
        if (string == null) return false;
        Set<Character> set = new HashSet<Character>();
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (set.contains(string.charAt(i))) {
                return false;
            } else {
                set.add(ch);
            }
        }
        return true;
    }

    public static boolean isUniqueChars2(String string) {
        if (string == null) return false;
        for (int i = 0; i < string.length(); i++) {
            for (int j = 0; j < string.length(); j++) {
                if (i != j) {
                    if (string.charAt(i) == string.charAt(j)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println(isUniqueChars("hello")); // return false
        System.out.println(isUniqueChars("world")); // return true
        System.out.println(isUniqueChars2("hello")); // return false
        System.out.println(isUniqueChars2("world")); // return true
    }
}
