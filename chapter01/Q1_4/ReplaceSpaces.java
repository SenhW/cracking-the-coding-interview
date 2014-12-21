/**
 * Question 1.4: Write a method to replace all spaces in a string with '%20'. You may assume that the string has
 * sufficient space at the end of the string to hold the additional characters, and that you are given the "true" length
 * of the string. (Note: if implementing in Java, please use a character array so that you can perform this operation
 * in place.)
 *
 * EXAMPLE
 * Input: "Mr John Smith    ", 13
 * Output: "Mr%20John%20Smith"
 */

public class ReplaceSpaces {

    public static void main(String[] args) {
        char[] mrJohnSmith = {'M', 'r', ' ', 'J', 'o', 'h', 'n', ' ', 'S', 'm', 'i', 't', 'h', ' ', ' ', ' ',' '};
        replaceSpaces(mrJohnSmith, 13);
        System.out.println(String.valueOf(mrJohnSmith)); // Prints Mr%20John%20Smith
        char[] abcdef = {'a', 'b', 'c', ' ', 'd', ' ', 'e', ' ', 'f', ' ', ' ', ' ', ' ', ' ', ' '};
        replaceSpaces(abcdef, 9);
        System.out.println(String.valueOf(abcdef)); // Prints abc%20d%20e%20f
    }

    public static void replaceSpaces(char[] str, int length) {
        // First pass: Count number of spaces
        int numSpaces = 0;
        for (int i = 0; i < length; i++) {
            if(str[i] == ' ') numSpaces++;
        }

        // Second pass: Replace spaces with '%20'
        int resultLength = length + 2 * numSpaces;
        for (int i = length - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[resultLength - 1] = '0';
                str[resultLength - 2] = '2';
                str[resultLength - 3] = '%';
                resultLength -= 3;
            }
            else {
                str[resultLength - 1] = str[i];
                resultLength--;
            }
        }
    }
}
