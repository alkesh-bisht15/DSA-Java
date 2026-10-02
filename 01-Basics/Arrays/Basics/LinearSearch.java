public class LinearSearch {

    public static void main(String[] args) {
        int[] numbers = {12, 7, 25, 3, 18};
        int target = 25;
        int index = linearSearch(numbers, target);
        System.out.println(index);
    }
    static int linearSearch(int[] numbers, int target){
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == target){
                return i; // Return the index of the target element
            }
        }
        return -1; // Return -1 if the target element is not found
    }
}
//Time Complexity : O(n), where n is the number of elements in the array.
// The algorithm iterates through the entire array once to find the target element.
//Best Case Time Complexity : O(1), when the target element is found at the first index of the array.
//Worst Case Time Complexity : O(n), when the target element is not present in the array or is found at the last index of the array.
//Space Complexity : O(1), as it uses a constant amount of space regardless of the input size.