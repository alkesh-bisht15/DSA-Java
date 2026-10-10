public class FindDuplicate{
  public static void main(String[] args){
    int[] numbers = {3, 1, 3, 4, 2};
    int result = findDuplicate(numbers);
    System.out.println(result);
  }
  static int findDuplicate(int[] numbers){
    int n = numbers.length;
    for (int i = 0; i < n; i++){
      for (int j = i+1; j< n; j++){
        if (numbers[i] == numbers[j]){
          return numbers[i];
        }
      }
    }  
    return -1; // No duplicate found
  }  
}
//Time Complexity : O(n^2) because we are using nested loops to compare each element with every other element in the array.
//Space Complexity : O(1) because we are using a constant amount of space for the variables i and j, and not using any additional data structures.
