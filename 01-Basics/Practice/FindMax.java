public class FindMax {
    public static void main(String[] args) {
        int[] numbers = {4, 8, 2, 15, 7};
        int max = findMax(numbers);
        System.out.println("The maximum number is: " + max);
    }

    static int findMax(int[] numbers){
        int max = numbers[0];
        for (int i=0; i<numbers.length; i++){
            if (numbers[i] > max){
                max = numbers[i];
            }
        }
        return max;
    }
}
