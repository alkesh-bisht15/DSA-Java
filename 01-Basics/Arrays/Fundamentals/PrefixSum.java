public class PrefixSum {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        int[] prefixSum = buildPrefixSum(numbers);
        for (int i=0; i<prefixSum.length; i++){
            System.out.print(prefixSum[i] + " ");
        }
    }
    static int[] buildPrefixSum(int[] numbers){
        int[] prefixSum = new int[numbers.length];
        prefixSum[0] = numbers[0];
        for (int i=1; i<numbers.length; i++){
            prefixSum[i] = prefixSum[i-1] + numbers[i];
        }
        return prefixSum;
    }
}
//Time Complexity : O(n) because the array is traversed once to calculate the prefix sum.
//Space Complexity : O(n) because we are using an additional array to store the prefix sum.