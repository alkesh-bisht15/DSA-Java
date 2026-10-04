public class ArrayAverage {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        double average = findAverage(numbers);
        System.out.println(average);
    }
    static double findAverage(int[] numbers){
        int sum = 0;
        for (int i=0; i < numbers.length; i++){
            sum += numbers[i];
        }
        return (double)sum / numbers.length;
    }
}
//Time Complexity : O(n) because the array is traversed once to calculate the sum.
//Space Complexity : O(1) because we are using a constant amount of space for the sum variable and the average calculation.