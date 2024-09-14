// src/main/java/Q1WeirdFunction.java

public class Q1WeirdFunction {

    // Recursive function implementation
    public static int fRecursive(int n) {
        if (n < 3) {
            return n;
        }
        return fRecursive(n - 1) + 2 * fRecursive(n - 2) + 3 * fRecursive(n - 3);
    }

    // Iterative function implementation
    public static int fIterative(int n) {
        if (n < 3) {
            return n;
        }

        int[] f = new int[n + 1];
        f[0] = 0;
        f[1] = 1;
        f[2] = 2;

        for (int i = 3; i <= n; i++) {
            f[i] = f[i - 1] + 2 * f[i - 2] + 3 * f[i - 3];
        }

        return f[n];
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Recursive f(" + n + ") = " + fRecursive(n));
        System.out.println("Iterative f(" + n + ") = " + fIterative(n));
    }
}

