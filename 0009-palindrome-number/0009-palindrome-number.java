import java.util.Scanner;  // Import the Scanner class
class Solution {
    public boolean isPalindrome(int org) {
        int rev=0,temp;
        temp=org;
        for(;org>0;){
            int digit =org%10;
            rev=rev*10+digit;
            org=org/10;
        }
        return(rev==temp);
    }
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        Solution sol = new Solution();
        
        // Output true or false
        System.out.println(sol.isPalindrome(num));

        scanner.close();
    }
}