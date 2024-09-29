import java.util.Scanner;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Loop through the array elements
        for (int i = 0; i < nums.length; i++) {
            // For each element, find a second element that sums up to the target
            for (int j = i + 1; j < nums.length; j++) {
                // Check if the two numbers add up to the target
                if (nums[i] + nums[j] == target) {
                    // Return the indices if a match is found
                    return new int[]{i, j};
                }
            }
        }
        // Return an empty array if no solution is found
        return new int[]{};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the array size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Taking input for the array elements
        int[] nums = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }

        // Taking input for the target sum
        System.out.print("Enter the target sum: ");
        int target = scanner.nextInt();

        // Creating an instance of Solution to call twoSum
        Solution solution = new Solution();
        int[] result = solution.twoSum(nums, target);

        // Displaying the result
        if (result.length == 0) {
            System.out.println("No solution found!");
        } else {
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        }

        // Closing the scanner
        scanner.close();
    }
}