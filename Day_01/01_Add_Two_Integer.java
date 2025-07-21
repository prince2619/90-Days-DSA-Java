/* Leetcode ID:-  2235. Add Two Integers  
Question:- 
Given two integers num1 and num2, return the sum of the two integers.
 

Example 1:

Input: num1 = 12, num2 = 5
Output: 17
Explanation: num1 is 12, num2 is 5, and their sum is 12 + 5 = 17, so 17 is returned.
Example 2:

Input: num1 = -10, num2 = 4
Output: -6
Explanation: num1 + num2 = -6, so -6 is returned.
 

Constraints:

-100 <= num1, num2 <= 100

Leet code Solution:-

class Solution {
    public int sum(int num1, int num2) {
        return num1+num2;
    }
}



*/ 

//? This is local solution.
package Day_01;
import java.util.Scanner;

 class Add_Two_Integer {
    
        // function to add two integers
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        
        int result = sum(num1, num2);
        System.out.println("The sum is: " + result);
        
        sc.close();
    }
}
