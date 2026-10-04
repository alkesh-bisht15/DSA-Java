public class ArraySum {

    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};
        int sum = arraySum(numbers);
        System.out.println(sum);
    }
    static int arraySum(int[] numbers){
        int sum = 0;
        for (int i=0; i < numbers.length; i++){
            sum += numbers[i];
        }
        return sum;
    }
}
// Time Complexity: O(n)
// We visit every element exactly once.

// Space Complexity: O(1)
// We only use one extra variable (sum), regardless of array size.