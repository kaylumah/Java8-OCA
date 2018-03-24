public class Loops {
    public static void main(String[] args) {
        System.out.println("Hello, Loops");

        // PAGE 81 of the Book mentions Loop Types

        // Most loops are likely well defined, there are a few edge cases
        // variations of the following 5 examples are likely to be seen on the exam 

        // InfiniteLoop();
        // MulitpleTermForStatement();
        // RedeclaringVariable();
        IncompetibleTypes();
    }

    public static void InfiniteLoop() {
        // This looks like it will throw a compiler error.
        // It is actually an infite loop
        // Since each component for the for loop is optional (see the three sections ;)
        // Without the three sections it will not compile
        for( ; ; ) {
            System.out.println("Hello World");
        }
    }

    public static void MulitpleTermForStatement() {
        int x = 0;
        // note: still three sections in the loop
        for (long y = 0, z = 4; x < 5 && y < 10; x++, y++) 
        {
            System.out.println(y + " ");
            // PRINTS: 
            // 0
            // 1
            // 2
            // 3
            // 4
        }
        System.out.println("X: " + x); // prints 5

        // 1. You can declare a variable (x) before the loop begins, and use if after the loop ends
        // 2. Your initialization block, boolean expression and update statements can include extra variables that may not referecne each other
        // 3. The update statement can update multiple variables (x,y)
    }

    public static void RedeclaringVariable() {
        // int x = 0;
        // error: variable x is already defined in method RedeclaringVariable()
        // for (long y = 0, x = 4; x < 5 && y < 10; x++, y++) {
        //    System.out.println("x " + x);
        // }


        // DOES COMPILE SINCE WE ARE ONLY ASSIGNING VALUE, NOT DECLARING A VARIABLE
        int x = 0;
        long y = 10;
        for (y = 0, x = 4; x < 5 && y < 10; x++, y++) {
           System.out.println("x " + x);
        }
    }

    public static void IncompetibleTypes(){
        // DOES NOT COMPILE, SINCE ALL THE VARIABLES IN THE initialization block
        // MUST BE OF THE SAME TYPE
       // for (long y = 0, int x = 4; x < 5 && y < 10; x++, y++) {
       //     System.out.println(x + " ");
       // }
    }
}
