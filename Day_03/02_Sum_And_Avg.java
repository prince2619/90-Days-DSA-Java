package Day_03;

/* 
💡 Question: Calculate the Sum and Average of Elements in an ArrayList

Given:
- An ArrayList of integers.
- You need to:
    ✅ Calculate the sum of all elements in the ArrayList.
    ✅ Calculate the average of the elements in the ArrayList (decimal precision).

Example:
Input: [5, 15, 25, 35, 45]
Output:
Sum: 125
Average: 25.0

Constraints:
- Use ArrayList for practice with dynamic arrays.
- Use enhanced for-loop for clean iteration.
- Use casting to double to ensure decimal precision in average.
*/

import java.util.ArrayList;

class SumAndAverageInArrayList {
    public static void main(String[] args) {

        // ✅ Step 1: Create an ArrayList and add elements
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(15);
        list.add(25);
        list.add(35);
        list.add(45);

        // ✅ Step 2: Calculate the sum of elements
        int sum = 0;
        for (int num : list) {
            sum += num; // adding each element to the sum
        }
        System.out.println("Sum: " + sum); // Output the sum

        // ✅ Step 3: Calculate the average of elements
        double average = (double) sum / list.size(); // casting sum to double for decimal result
        System.out.println("Average: " + average); // Output the average
    }
}

