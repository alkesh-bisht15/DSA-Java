public class LeftRotateArrayByK {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        leftRotate(numbers, k);
        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
    }
    static void leftRotate(int[] numbers, int k){
        if (numbers == null || numbers.length == 0) {
            return; // Handle empty or null array
        }
        int n = numbers.length;
        k = k % n; // In case k is greater than n
        reverse (numbers, 0, n-1);
        reverse (numbers, 0, n-k-1);
        reverse (numbers, n-k, n-1);
    }
    static void reverse(int[] numbers, int start, int end){
        for (int i = start, j = end; i < j; i++, j--){
            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }
    }
}
//Time Complexity : O(n) because the array is travered three times, each taking O(n) time in total.
//Space Complexity : O(1) because we are not using any extra space.
