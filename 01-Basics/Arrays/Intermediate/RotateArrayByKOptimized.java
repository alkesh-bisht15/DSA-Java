public class RotateArrayByKOptimized {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotateByK(numbers, k);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
    static void rotateByK(int[] numbers, int k){
        int n = numbers.length;
        k = k % n;
        reverse(numbers, 0, n-1);
        reverse(numbers, 0, k-1);
        reverse(numbers, k, n-1);
    }
    static void reverse(int[] numbers, int start, int end){
        while(start < end){
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
    }
}
//Time Complexity : O(n) where n is the number of elements in the array. The reverse function is called three times, each taking O(n) time in total.
//Space Comeplexity : O(1) as we are not using any extra space.