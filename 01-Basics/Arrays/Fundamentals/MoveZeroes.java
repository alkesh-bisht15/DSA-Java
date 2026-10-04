public class MoveZeroes {

    public static void main(String[] args) {
        int[] numbers = {0, 1, 0, 3, 12};
        moveZeroes(numbers);
    }
    static void moveZeroes(int[] nums) {
        int position = 0; // Position to place the next non-zero element
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[position] = nums[i];
                position++;
            }
        }
        // Fill the remaining positions with zeros
        for (int i = position; i < nums.length; i++) {
            nums[i] = 0;
        }
        System.out.println("After moving zeroes to the end, the array is: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
//Time Complexity : O(n + n) = O(n) because the array is traversed twice, 
// once to move non-zero elements and once to fill zeros.
//Space Complexity : O(1) because we are using a constant amount of space for the position variable.
