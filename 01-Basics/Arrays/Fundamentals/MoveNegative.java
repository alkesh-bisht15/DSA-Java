public class MoveNegative {

    public static void main(String[] args) {
        int[] nums = {3, -2, 5, -7, 8, -1, 4};
        moveNegatives(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    static void moveNegatives(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                if (i != j) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
                j++;
            }
        }

    }
}
//Time Complexity : O(n) because the array is traversed once to move negative numbers to the front.
//Space Complexity : O(1) because we are using a constant amount of space for the variable j and the temporary variable temp.