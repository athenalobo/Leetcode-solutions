// Given an integer x, return true if x is a palindrome, and false otherwise. 

// Example 1:

// Input: x = 121
// Output: true
// Explanation: 121 reads as 121 from left to right and from right to left.



class Solution 
{
    public static boolean isPalindrome(int x) 
    {
        if(x==0)
        return true;
        int y=x;
        int rev=0;
        while(y>0)
        {
            int d=y%10;
            rev=rev*10 + d;
            y/=10;
        }
        return (rev==x);
    }
}