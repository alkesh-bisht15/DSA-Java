public class CountOccurrences {

    public static void main(String[] args) {
        int[] numbers = {2, 5, 2, 8, 2, 10, 5};
        int target = 2;
        int occurrences = countOccurrences(numbers, target);
        System.out.println(occurrences);
    }
    static int countOccurrences(int[] numbers, int target){
        int count  = 0;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == target){
                count++;
            }
        }
        return count;
    }
}
//Time Complexity : O(n), where n is the number of elements in the array.
// The algorithm iterates through the entire array once to count the occurrences of the target element.
//Space Complexity : O(1), as it uses a constant amount of space regardless of the input size.