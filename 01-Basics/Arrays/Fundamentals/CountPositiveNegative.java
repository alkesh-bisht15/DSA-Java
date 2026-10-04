public class CountPositiveNegative {
    public static void main(String[] args) {
        int[] numbers = {-5, 3, -2, 8, 0, -7, 4};
        countNumbers(numbers);
    }
    static void countNumbers(int[] numbers){
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > 0){
                positiveCount++;
            } else if (numbers[i] < 0){
                negativeCount++;
            }
            else {
                zeroCount++;
            }
        }
        System.out.println("Positive numbers: " + positiveCount);
        System.out.println("Negative numbers: " + negativeCount);
        System.out.println("Zeroes: " + zeroCount);
    }
}
//Time Complexity : O(n) because the array is traversed once to count positive, negative, and zero numbers.
//Space Complexity : O(1) because we are using a constant amount of space for the positiveCount, negativeCount, and zeroCount variables.
