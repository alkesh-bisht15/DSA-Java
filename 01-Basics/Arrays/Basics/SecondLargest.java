public class SecondLargest {
    public static void main(String[] args) {
        int[] numbers = {20, 20, 15};
        int secondLargestValue = secondLargest(numbers);
        System.out.println(secondLargestValue);
    }
    static int secondLargest(int[] numbers) {
        int max = numbers[0];
        int secondMax = numbers[1];
        if (secondMax > max) {
            int temp = max;
            max = secondMax;
            secondMax = temp;
        }
        for (int i=2; i < numbers.length; i++){
            if (numbers[i] > max){
                secondMax = max;
                max = numbers[i];
            }
            else{
                if ( numbers[i] < max && numbers[i] > secondMax){
                    secondMax = numbers[i];
                }
            }
        }
        return secondMax;
    }
}
//Time Complexity : O(n), where n is the number of elements in the array.
//Space Complexity : O(1), as it uses a constant amount of space regardless of the input size.
