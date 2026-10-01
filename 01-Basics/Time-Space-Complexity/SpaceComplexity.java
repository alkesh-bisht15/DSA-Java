public class SpaceComplexity {

    // Example 1: O(1) Space
    static void constantSpace(int n) {

        int sum = n + 10;
        int result = sum * 2;

        System.out.println(result);
    }

    // Example 2: O(1) Space
    static void findMax(int[] numbers) {

        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Maximum: " + max);
    }

    // Example 3: O(n) Space
    static void createArray(int n) {

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = i;
        }

        System.out.println("Array created with " + n + " elements.");
    }

    // Example 4: O(n) Space
    static void createCopy(int[] numbers) {

        int[] copy = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            copy[i] = numbers[i];
        }

        System.out.println("Array copied.");
    }

    // Example 5: O(n²) Space
    static void createMatrix(int n) {

        int[][] matrix = new int[n][n];

        System.out.println("Matrix created: " + matrix.length + " rows.");
    }

    public static void main(String[] args) {

        constantSpace(10);

        int[] numbers = {4, 8, 2, 9, 1};
        findMax(numbers);

        createArray(5);

        createCopy(numbers);

        createMatrix(5);
    }
}