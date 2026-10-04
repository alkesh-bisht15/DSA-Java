public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
        int newLength = removeDuplicates(nums);
        System.out.println(newLength);
    }
    static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int position = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[position] = nums[i];
                position++;
            }
        }
        return position;
    }
}
// Time Complexity: O(n) - traverse the array once
// Space Complexity: O(1) - modify the array in-place
