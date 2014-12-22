import java.util.Arrays;

/**
 * Question 1.3: Given two strings, write a method to decide if one is a permutation of the other.
 */

public class IsPermutation {

    public static boolean isPermutation(String str1, String str2) {
        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }
    
    public static void main(String[] args) {
        System.out.println(isPermutation("a", "b")); // false
        System.out.println(isPermutation("cheaters", "teachers")); // true
        System.out.println(isPermutation("abc", "abcs")); // false
        System.out.println(isPermutation("ab", "ba")); // true
    }
}
