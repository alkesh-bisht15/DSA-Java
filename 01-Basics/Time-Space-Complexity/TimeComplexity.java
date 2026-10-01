public class TimeComplexity {

    // O(1)
    static void constantTime(int n) {
        System.out.println(n);
    }

    // O(n)
    static void linearTime(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }

    // O(n^2)
    static void quadraticTime(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + " " + j);
            }
        }
    }

    public static void main(String[] args) {
        constantTime(10);
        linearTime(10);
        quadraticTime(10);
    }
}