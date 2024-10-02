import java.util.Scanner;  // Import the Scanner class

class Solution {
    public boolean isPalindrome(int org) {
        // Negative numbers are not palindromes
        if (org < 0) {
            return false;
        }

        int rev = 0, temp = org;

        // Loop to reverse the number
        while (org > 0) {
            int digit = org % 10;  // Get the last digit
            rev = rev * 10 + digit;  // Add the digit to reversed number
            org = org / 10;  // Remove the last digit from original number
        }

        // Check if reversed number is the same as the original
        return (rev == temp);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create Scanner object

        // Get user input
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        Solution sol = new Solution();  // Create instance of Solution class

        // Output true or false based on whether the number is a palindrome
        System.out.println(sol.isPalindrome(num));

        scanner.close();  // Close the Scanner object
    }
}