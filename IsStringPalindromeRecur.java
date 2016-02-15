package com.suyashc.practice;

public class IsStringPalindromeRecur
{
    public static void main(String[] args)
    {
        // System.out.println(isPalindrome("abbabba"));
        IsStringPalindromeRecur soln = new IsStringPalindromeRecur();
        System.out.println(soln.isPalindrome("abbabba"));
    }

    private boolean isPalindrome(String inpString)
    {
        if (null == inpString)
        {
            return false;
        }

        // Base case
        if (inpString.length() == 0 || inpString.length() == 1)
        {
            return true;
        }

        // First and Last Letter Match and internal is Palindrome
        if (inpString.charAt(0) == inpString.charAt(inpString.length() - 1))
        {
            if (inpString.length() > 4)
            {
                return isPalindrome(inpString.substring(1, inpString.length() - 2));
            } else
            {
                return true;
            }
        } else
        {
            return false;
        }

        // Things to remember
        // 1. If we make a call isPalindrome("abbabba"), we have to make the method static
        // For Sting the length is calculated as .length() function
        // For Stings the substring method is is all lowercase
        // For charAt function we compare using ==
    }
}
