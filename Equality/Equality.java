public class Equality {
    public static void main(String[] args) {
        System.out.println("Hello, Equality");

        Integer a = 0;
        Integer b = 0;
        int c = 0;
        int d = 0;
 
        if (a == b) {
            System.out.println("Compare Integer with Integer (==)");
        }
 
        if (c == d) {
            System.out.println("Compare int with int (==)");
        }
 
        if (a == c) {
            System.out.println("Compare Integer with int (==)");
        }
 

        if (d == b) {
            System.out.println("Compare int with Integer (==)");
        }
 
        if (a.intValue() == c) {
            System.out.println("int value");
        }
 
        if (a.equals(c)){
            System.out.println("equals comparison");
        }
    }
}