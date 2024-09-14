public class Q2PrintArray {
    private static int[] array = {1, 2, 3, 4, 5, 6, 7};

    public static void main(String[] args) {
        printRecursion(array.length);
    }

    private static void printRecursion(int i) {
        // Base case: If i reaches 0, stop recursion
        if (i == 0) {
            return;
        }
        
        // Recursive case: First, recurse down to the base case, then print the elements on return
        printRecursion(i - 1);
        System.out.println(array[i - 1]);
    }
}
