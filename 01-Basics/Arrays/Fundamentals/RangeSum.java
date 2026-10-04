public class RangeSum {

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        int[] prefixSum = buildPrefixSum(numbers);
        int left = 1; // Starting index of the range (inclusive)
        int right = 3; // Ending index of the range (inclusive)
        int sum = rangeSum(prefixSum, left, right);
        System.out.println(sum);
    }
    static int[] buildPrefixSum(int[] numbers){
        int[] prefixSum = new int[numbers.length];
        prefixSum[0] = numbers[0];
        for (int i=1; i<numbers.length; i++){
            prefixSum[i] = prefixSum[i-1] + numbers[i];
        }
        return prefixSum;
    }
    static int rangeSum(int[] prefixSum, int left, int right){
        if (left == 0){
            return prefixSum[right];
        }
        return prefixSum[right] - prefixSum[left-1];
    }
}
//Time Complexity : O(n) for building the prefix sum array and O(1) per range query.
//Space Complexity : O(n) for storing the prefix sum array.