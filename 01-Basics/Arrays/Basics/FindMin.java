public class FindMin{

    public static void main(String[] args){
        int[] numbers = {8, 3, 12, 5, 2, 10};
        int minValue = findMin(numbers);
        System.out.println("The minimum value is: " + minValue);
    }
    static int findMin(int[] numbers){
        int min = numbers[0];
        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] < min){
                min = numbers[i];
            }
        }
        return min;
    }
}
//Time Complexity : O(n), where n is the number of elements in the array. 
// The algorithm iterates through the entire array once to find the minimum value.
//Space Complexity : O(1), as it uses a constant amount of space regardless of the input size.