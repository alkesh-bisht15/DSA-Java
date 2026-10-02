public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        reverse(numbers);
    }
    static void reverse(int[] numbers) {
        int end = numbers.length - 1;
        for (int start = 0; start < end; start++, end--) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
        }
        System.out.println(java.util.Arrays.toString(numbers));
    }
}
//Time Complexity : O(n), where n is the number of elements in the array.
//Space Complexity : O(1), as it uses a constant amount of space regardless of the input size.