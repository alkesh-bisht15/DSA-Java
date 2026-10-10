public class MergeTwoSortedArrays {

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};
        int[] mergedArray = merge(arr1, arr2);
        for(int i = 0; i < mergedArray.length; i++){
            System.out.print(mergedArray[i] + " ");
        }
    }
    static int[] merge(int[] arr1, int[] arr2){
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] mergedArray = new int[n1 + n2];
        int i = 0, j = 0, k = 0;
        while(i < n1 && j < n2){
            if(arr1[i] <= arr2[j]){
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }
        // Add remaining elements from arr1 or arr2 if any
        while(i < n1){
            mergedArray[k++] = arr1[i++];
        }
        while(j < n2){
            mergedArray[k++] = arr2[j++];
        }
        return mergedArray;
    }
}
//Time Complexity : O(n1 + n2) where n1 and n2 are the number of elements in arr1 and arr2 respectively. We are traversing both arrays once.
//Space Complexity : O(n1 + n2) as we are creating a new array to store the merged result.
