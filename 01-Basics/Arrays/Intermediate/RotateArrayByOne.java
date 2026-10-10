public class RotateArrayByOne {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        rotateByOne(numbers);
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
    static void rotateByOne(int[] numbers){
        int n = numbers.length;
        int lastElement = numbers[n - 1];
        for (int i = n - 1; i > 0; i--){
            numbers[i] = numbers[i - 1];
        }
        numbers[0] = lastElement;
    }
}
//Time Complexity : O(n) because the array is traversed once to shift the elements.
//Space Complexity : O(1) because we are using a constant amount of space for the lastElement variable, and not using any additional data structures.
