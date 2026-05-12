package com.codeprep;

/*
* Is Palindrome Valid
*
* A palindrome is a sequence of characters that reads the same forward and backward.
* Given a string, determine if it's a palindrome after removing all non-alphanumeric characters.
* A character is alphanumeric if it's either a letter or a number.
*
Example 1:
Input: s = 'a dog! a panic in a pagoda.'
Output: True

Example 2:
Input: s = 'abc123'
Output: False

* Constraints:
* The string may include a combination of lowercase English letters, numbers, spaces, and punctuations.
* */

public class ValidPalindrome {

    static void main() {
        // Test case 1: True condition
        String str1 = "a dog! a panic in a pagoda.";
        System.out.println("Test 1 (True): " + is_palindrome_valid(str1));

        // Test case 2: False condition
        String str2 = "abc123";
        System.out.println("Test 2 (False): " + is_palindrome_valid(str2));
    }

    public static Boolean is_palindrome_valid(String s) {

        int left = 0, right = s.length() - 1;
        while (left < right) {

            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
}
