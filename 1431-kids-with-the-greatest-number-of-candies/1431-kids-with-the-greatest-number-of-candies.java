import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Solution {

    // Method to determine if kids can have the greatest number of candies
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> booleanList = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            int max = candies[i] + extraCandies; // Add extraCandies to current child’s candies

            boolean hasMax = true;
            for (int j = 0; j < candies.length; j++) {
                if (i != j && max < candies[j]) {  // Compare with other kids' candies
                    hasMax = false;
                    break;  // Stop checking further if any child has more
                }
            }
            booleanList.add(hasMax);  // Add the result to the boolean list
        }
        return booleanList;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ArrayList to store user inputs
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Enter non-negative integers (type 'done' to finish): ");

        while (true) {
            String input = sc.nextLine();  // Take input as a string
            if (input.equalsIgnoreCase("done")) {
                break;  // Stop input when 'done' is entered
            }
            try {
                int num = Integer.parseInt(input);  // Convert to integer
                if (num < 0) {
                    System.out.println("Please enter a non-negative integer.");
                } else {
                    numbers.add(num);  // Add to the ArrayList
                }
            } catch (NumberFormatException e) {  // Handle invalid input
                System.out.println("Invalid input. Please enter an integer or 'done'.");
            }
        }

        // Convert ArrayList to an array
        int[] candies = numbers.stream().mapToInt(i -> i).toArray();

        // Take input for extraCandies
        int extraCandies = 0;
        System.out.println("Enter the number of extraCandies: ");
        while (true) {
            String inputExtra = sc.nextLine();
            try {
                extraCandies = Integer.parseInt(inputExtra);
                if (extraCandies < 0) {
                    System.out.println("Extra candies should be a non-negative number.");
                } else {
                    break;  // Valid input, break the loop
                }
            } catch (NumberFormatException e) {
                System.out.println("Extra candies should be a positive integer.");
            }
        }

        // Call the method and print the result
        List<Boolean> result = kidsWithCandies(candies, extraCandies);
        System.out.println(result);

        sc.close();  // Close the scanner
    }
}
