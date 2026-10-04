public class MaxMinDifference {

    public static void main(String[] args) {
        int[] numbers = {8, 3, 12, 5, 2, 10};
        int difference = maxMinDifference(numbers);
        System.out.println(difference);
    }
    static int maxMinDifference(int[] numbers) {
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            else if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return max - min;
    }
}
//Time Complexity : O(n) because the array is traversed once to find the maximum and minimum values.
//Space Complexity : O(1) because we are using a constant amount of space for the max and min variables.
