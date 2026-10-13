public class LeftRotateArrayByOne{

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        leftRotate(numbers);
        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
    }
    static void leftRotate(int[] numbers){
        if (numbers == null || numbers.length == 0) {
            return; // Handle empty or null array
        }
        int temp = numbers[0];
        int n = numbers.length;
        for (int i = 0; i < n-1 ; i++){
            numbers[i] = numbers[i+1];
        }
        numbers[n-1] = temp;
    }
}
//Time Complexity  : O(n) because the array is traversed once.
//Space Complexity : O(1) because no extra space is used.