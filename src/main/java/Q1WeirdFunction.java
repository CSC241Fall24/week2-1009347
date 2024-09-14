// src/main/java/Q1WeirdFunction.java

public class Q1WeirdFunction {

    public static int recursiveF(int n) {
        // TODO: Implement the recursive function
        if (n < 3) {
            return n;
        }
        return recursiveF(n - 1) + 2 * recursiveF(n - 2) + 3 * recursiveF(n - 3);
        
        //return 0;
    }

    public static int iterativeF(int n) {
        // TODO: Implement the iterative function
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
        //return 0;
    }

   
   public static void main(String[] args) {
        int n = 5;
        System.out.println("Recursive f(" + n + ") = " + recursiveF(n));

        System.out.println("Iterative f(" + n + ") = " + iterativeF(n));
    }
    
}
