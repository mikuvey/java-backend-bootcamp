package io.javabrains.javabasics;

public class ArrayChallenge {
    public static void main(String[] args) {
        // Step 1: Create an array of integers

        int[] nums = {0, 1, 2, 3, 4, 5, 6};
        int sum = 0, avg = 0;
        int largest = nums[0];

        // Step 2: Use arrays and array operations to find the sum, average, and largest number in the array
        for(int i =0; i<nums.length; i++){
            sum += nums[i];

            largest = Math.max(largest, nums[i]);
        }
        avg = sum/nums.length;

        System.out.println("sum = "+ sum);
        System.out.println("avg = "+ avg);
        System.out.println("largest = "+ largest);
        

    }
}
