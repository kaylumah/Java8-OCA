public class WorkingWithStrings {
    public static void main(String[] args) {
        stringConcatenation();
        importantStringMethods();
    }

    private static void stringConcatenation() {
        /**
            PAGE 103
            Combining two Strings together is called string concatenation.
            RULES:
                1. If both operands are nummeric + means addition
                2. If either operand is a String + means concatenation.
                3. The expression is evaluated from left to right.
         */

         System.out.println(1 + 2); // 3 using rule 1
         System.out.println("a" + "b"); // ab using rule 2
         System.out.println("a" + "b" + 3); // ab3 using rule 2 and 3
         // "a" + "b" = "ab"  so "ab" + 3 using rule 2 would be "ab3"
         System.out.println(1 + 2 + "c"); // 3c using first rule 3 than rule 2

        /**
            THE EXAM WILL TRY TO TRICK YOU WITH:
         */
         int three = 3;
         String four = "4";
         System.out.println(1 + 2 + three + four); // 64 always pay attention to the types

         String s = "1"; // s => "1";
         s += "2"; // s => "12";
         s += 3; // s => "123";
         System.out.println(s); // 123

         s += (2+3); // s => 1235 because we use ()
         System.out.println(s);
    }

    private static void importantStringMethods() {
        stringLength();
        stringCharAt();
        stringIndexOf();
        stringSubstring();
        stringUpperCaseAndLowerCase();
        stringEqualsAndEqualsIgnoreCase();
        stringStartsWithAndEndsWith();
        stringContains();
        stringReplace();
        stringTrim();
    }

    private static void stringLength() {

    }

    private static void stringCharAt() {

    }

    private static void stringIndexOf() {

    }

    private static void stringSubstring() {

    }

    private static void stringUpperCaseAndLowerCase() {

    }

    private static void stringEqualsAndEqualsIgnoreCase() {

    }

    private static void stringStartsWithAndEndsWith() {

    }

    private static void stringContains() {

    }

    private static void stringReplace() {

    }

    private static void stringTrim() {

    }
}
