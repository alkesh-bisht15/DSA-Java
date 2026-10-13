public class UnionOfTwoArrays {

    public static void main(String[] args) {
        int[] arr1 = { 2, 2, 3, 4, 3 };
        int[] arr2 = { 2, 3, 4, 5 };
        union(arr1, arr2);
    }

    static void union(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] result = new int[n1 + n2];
        int size = 0;
        for (int i = 0; i < n1; i++) {
            if (!contains(result, size, arr1[i])) {
                result[size++] = arr1[i];
            }
        }
        for (int i = 0; i < n2; i++) {
            if (!contains(result, size, arr2[i])) {
                result[size++] = arr2[i];
            }
        }
        // Print the union
        for (int i = 0; i < size; i++) {
            System.out.print(result[i] + " ");
        }
    }
    static boolean contains(int[] result, int size, int target) {
        for (int i = 0; i < size; i++) {
            if (result[i] == target) {
                return true;
            }
        }
        return false;
    }
}
//Time Complexity : O(n1² + n2²) in the worst case, where n1 and n2 are the lengths of arr1 and arr2 respectively.
//Auxiliary space Complexity : O(n1 + n2) for the result array.