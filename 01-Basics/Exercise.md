//What is the Time Complexity of the following code?

System.out.println(numbers[4]);
// Time Complexity: O(1)

//What is the time complexity of the following code?

for (int i = 0; i < n; i++) {
    System.out.println(i);
}
//Time Complexity : O(n)

//What is the time complexity of the following code?

for (int i = 0; i < n; i++) {

    for (int j = 0; j < n; j++) {

        System.out.println(i + j);
    }
}
//Time Complexity : O(n^2)

//What is the Complexity?

for (int i = 0; i < n; i++) {
    System.out.println(i);
}

for (int j = 0; j < n; j++) {
    System.out.println(j);
}
//Time Complexity : O(2n) == O(n) //We drop the constant 
//Space Complexity : O(1)

//What is the Complexity?

for (int i = 0; i < n; i++) {

    for (int j = 0; j < 10; j++) {

        System.out.println(i + j);
    }
}
//Time Complexity : O(n x 10 = 10n) == O(n) //We drop the constant
//Space Complexity : O(1)