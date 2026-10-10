public class FrequencyOfElement {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 2, 4, 2};
        int target = 2;
        int frequency = countFrequency(numbers, target);
        System.out.println("Frequency of " + target + " is: " + frequency);
    }
    static int countFrequency(int[] numbers, int target){
        int count  = 0; 
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] == target){
                count++;
            }
        }
        return count;
    }
}
//Time Complexity : O(n) because the array is traversed once to count the occurrences of the target element.
//Space Complexity : O(1) because we are using a constant amount of space for the count variable, and not using any additional data structures.