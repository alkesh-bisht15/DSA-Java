public class MissingNumber {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 5};
        int missingNumber = findMissingNumber(numbers);
        System.out.println(missingNumber);
    }
    static int findMissingNumber(int[] numbers){
        int n = numbers.length + 1;
        int totalSum = n * (n + 1) / 2;
        int arraySum = 0;
        for (int num : numbers) {
            arraySum += num;
        }
        return totalSum - arraySum;
    }
}
//Time Complexity : O(n) because the array is traversed once to calculate the sum of its elements.
//Space Complexity : O(1) because we are using a constant amount of space for the totalSum and arraySum variables.