public class RotateArrayByK {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int k = 2;
        rotateByK(numbers, k);
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
    static void rotateByK(int[] numbers, int k){
        int n = numbers.length;
        if (n == 0) return; // Handle empty array
        k = k % n; // In case k is greater than n
        for (int i = 0; i < k; i++){
            int lastElement = numbers[n - 1];
            for (int j = n - 1; j > 0; j--){
                numbers[j] = numbers[j - 1];
            }
            numbers[0] = lastElement;
        }
    }
}
//Time Complexity : O(n*k) because the array is traversed k times to shift the elements.
//Space Complexity : O(1) because we are using a constant amount of space for the lastElement variable, and not using any additional data structures.