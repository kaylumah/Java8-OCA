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
        WorkingWithPrimitives();
    }

    private static void WorkingWithPrimitives(){
        // SEE PAGE 60 of the book
        // int x = 1.0; // DOES NOT COMPILE error: incompatible types: possible lossy conversion from double to int
        // short y = 192122; // DOES NOT COMPILE error:incompatible types: possible lossy conversion from int to short
        // int z = 9f; // DOES NOT COMPILE possible lossy conversion from float to int
        // long t = 192301398193810323; // DOES NOT COMPILE error: integer number too large: 192301398193810323
    
        int x = (int)1.0;
        short y = (short)1921222;
        System.out.println("Short y = " + y);
        int z = (int)9f;
        long t = 192301398193810323L; // note the l at the end

        System.out.println(2147483647 + 1); // -2147483648 (since 2147483647 is the max int value. adding positive will move
        // to the next negative line );
    
    }
}