public class CheckSorted {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        boolean sorted = isSorted(numbers);
        System.out.println(sorted);
    }
    static boolean isSorted(int[] numbers) {
        int n = numbers.length;
        for (int i=0; i < n-1; i++){
            if (numbers[i] > numbers[i+1]){
                return false;
            }
        }
        return true;
    }
}
//Time Complexity : O(n), where n is the number of elements in the array.
//Space Complexity : O(1), as it uses a constant amount of space regardless of the input size.