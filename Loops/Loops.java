public class Loops {
    public static void main(String[] args) {
        System.out.println("Hello, Loops");

        // PAGE 81 of the Book mentions Loop Types

        // Most loops are likely well defined, there are a few edge cases
        // variations of the following 5 examples are likely to be seen on the exam 

        InfiniteLoop();
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
}
