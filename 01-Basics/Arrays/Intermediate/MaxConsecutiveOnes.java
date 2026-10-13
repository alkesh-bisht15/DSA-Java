public class MaxConsecutiveOnes {

    public static void main(String[] args) {
        int[] numbers = {1, 1, 0, 1, 1, 1};
        int maxConsecutiveOnes = findMaxConsecutiveOnes(numbers);
        System.out.println("Maximum Consecutive Ones: " + maxConsecutiveOnes);
    }
    static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                }
            } 
            else {
                
                count = 0;
            }
        }

        return maxCount;
    }
}
//Time Complexity : O(n) where n is the length of nums array.
//Auxiliary space Complexity : O(1) as we are using constant space.