public class TryCatchSyntax {
    public static void main(String[] args) {
        // $ javac TryCatchSyntax.java
        System.out.println("Hello, ExceptionHandling");

        // Will only print try block
        try {
            System.out.println("TRY BLOCK");
        } catch (Exception e) {
            System.out.println("We have an exception, that is sad");
        }

        // Will print both
        try {
            System.out.println("TRY BLOCK");
        } finally{
            System.out.println("We dont do catch, that is fine");
        }

        // Will print try
        try {
            System.out.println("TRY BLOCK");
            System.exit(0);
        } finally{
            System.out.println("We dont do catch, that is fine");
        }

        // DOES NOT COMPILE
        // 
// TryCatchSyntax.java:12: error: '{' expected
//         try
//            ^
// TryCatchSyntax.java:14: error: 'catch' without 'try'
//         catch (Exception e) {
//         ^
// TryCatchSyntax.java:12: error: 'try' without 'catch', 'finally' or resource declarations
//         try
//         ^
// TryCatchSyntax.java:31: error: reached end of file while parsing
// }
//  ^
// 4 errors

        // try
        //     System.out.println("TRY BLOCK");
        // catch (Exception e) {
        //     System.out.println("We have an exception, that is sad");
        // }

      //  DOES NOT COMPILE

//       TryCatchSyntax.java:37: error: '{' expected
//         } catch (Exception e)
//                              ^
// TryCatchSyntax.java:47: error: reached end of file while parsing
// }
//  ^
// 2 errors

        // try {
        //     System.out.println("TRY BLOCK");
        // } catch (Exception e)
        //     System.out.println("We have an exception, that is sad");
        
        // DOES NOT COMPILE
        // TryCatchSyntax.java:25: error: 'try' without 'catch', 'finally' or resource declarations
        // try {
        //     System.out.println("TRY BLOCK");
        // }

    }
}