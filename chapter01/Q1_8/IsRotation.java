/**
 * Question 1.8: Assume you have a method isSubstring which checks if one word is a substring of another. Given two
 * strings, s1 and s2, write code to check if s2 is a rotation of s1 using only one call to isSubstring (e.g.,
 * "waterbottle" is a rotation of "erbottlewat").
 */

public class IsRotation {

    public static boolean isRotation(String s1, String s2) {
        if(s1.length() == s2.length())
            return isSubstring(s1 + s1, s2);
        return false;
    }

    public static boolean isSubstring(String big, String small) {
        return big.contains(small);
    }

    public static void main(String[] args) {
        System.out.println(isRotation("waterbottle", "erbottlewat")); // Returns true
        System.out.println(isRotation("waterbottle", "erbottlewa")); // Returns false
        System.out.println(isRotation("waterbottle", "erbottlewak")); // Returns false
    }
}
