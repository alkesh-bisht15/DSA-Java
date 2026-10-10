public class IntersectionOfTwoArrays {

    public static void main(String[] args) {
        int[] arr1 = {2, 2, 3, 4, 3};
        int[] arr2 = {2, 3, 4, 5};
        findIntersection(arr1, arr2);
    }
    static void findIntersection(int[] arr1, int[] arr2){
        int n1 = arr1.length;
        int n2 = arr2.length;
        for (int i = 0; i < n1; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr1[i] == arr1[j]) {
                    isDuplicate = true;
                    break; // To avoid printing duplicates if arr1 has the same element multiple times
                }
            }
            if (isDuplicate) {
                continue;
            }
            for (int j = 0; j < n2; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    break; // To avoid printing duplicates if arr2 has the same element multiple times
                }
            }
        }
        
    }
}
//Time Complexity : O(n1² + n1 × n2) in the worst case.
//Auxiliary space Complexity : O(1)