// src/main/java/Q1WeirdFunction.java

public class Q1WeirdFunction {

    public static int fRecursive(int n) {
        // TODO: Implement the recursive function
        if (n < 3) {
            return n;
        }
        return fRecursive(n - 1) + 2 * fRecursive(n - 2) + 3 * fRecursive(n - 3);
        
        //return 0;
    }

    public static int fIterative(int n) {
        // TODO: Implement the iterative function
        if (n < 3) {
            return n;
        }

        int f0 = 0; // f(0)
        int f1 = 1; // f(1)
        int f2 = 2; // f(2)
        int result = 0;

        for (int i = 3; i <= n; i++) {
            result = f2 + 2 * f1 + 3 * f0;
            f0 = f1;
            f1 = f2;
            f2 = result;
        //return 0;
    }
    return result;
   }
   
   public static void main(String[] args) {
        System.out.println("Recursive result for n=4: " + fRecursive(4));

        System.out.println("Iterative result for n=4: " + fIterative(4));
    }
}

