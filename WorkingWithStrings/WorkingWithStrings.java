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

        /**
            The String class has dozens of methods.
            For the exam you only need a dozen.
            For all remember a String is a sequence of Characters and counts from 0 when indexed.
         */

        stringLength(); // 106
        stringCharAt(); 
        stringIndexOf();
        stringSubstring(); // 107
        stringUpperCaseAndLowerCase();
        stringEqualsAndEqualsIgnoreCase(); // 109
        stringStartsWithAndEndsWith();
        stringContains();
        stringReplace(); // 110
        stringTrim();
    }

    private static void stringLength() {
        String animals = "animals";
        System.out.println(animals.length()); // 7 counting uses non-0 based
    }

    private static void stringCharAt() {
        String animals = "animals";
        System.out.println(animals.charAt(0)); // a
        System.out.println(animals.charAt(6)); // s
        // System.out.println(animals.charAt(7)); // Exception java.lang.StringIndexOutOfBoundsException: String index out of range: 7

        // because of 0-based index the charAt(0) returns first character in the sequence.
        // charAt(7) returns the 8 character that doesn't exist and throws a exception
    }

    private static void stringIndexOf() {
        String animals = "animals";
        System.out.println(animals.indexOf('a')); // 0
        System.out.println(animals.indexOf("al")); // 4
        System.out.println(animals.indexOf('a', 4)); // 4
        System.out.println(animals.indexOf("al", 5)); // -1

        /**
            unlike charAt, the indexOf doesn't throw an exception.
            since indexing begins at 0 the caller knows -1 cannot be a valid index
         */
    }

    private static void stringSubstring() {
        /**
            Substring returns part of a sequence in a String.
            The first parameter is the 0-based index to start for the returned string.
            The second parameter is the index you want to STOP at.
                This means the endIndex can be one past the number in the sequence.
                In your own code this would be redudant, but the exam can use it. 
         */
        String animals = "animals";
        System.out.println(animals.substring(3)); // mals
        System.out.println(animals.substring(animals.indexOf('m'))); // mals
        System.out.println(animals.substring(3,4)); // m // start with 3 until, not including 4 (same as charAt 3)
        System.out.println(animals.substring(3,7)); // mals // 7 is the same as end of the string, so we take 6 as last

        System.out.println(animals.substring(3,3)); // empty string
        // System.out.println(animals.substring(3,2)); // java.lang.StringIndexOutOfBoundsException: begin 3, end 2, length 7
        // System.out.println(animals.substring(3, 8)); // java.lang.StringIndexOutOfBoundsException: begin 3, end 8, length 7
    }

    private static void stringUpperCaseAndLowerCase() {
        String animals = "animals";
        // only need to remember strings are immutable so original string is unchanged
        System.out.println(animals.toUpperCase()); // ANIMALS
        System.out.println("Abc123".toLowerCase()); // abc123
        System.out.println(animals); // animals
    }

    private static void stringEqualsAndEqualsIgnoreCase() {
        // boolean equals(Object obj)
        // boolean equalsIgnoreCase(String str)
        System.out.println("abc".equals("ABC")); // false
        System.out.println("ABC".equals("ABC")); // true
        System.out.println("abc".equalsIgnoreCase("ABC")); // true
    }

    private static void stringStartsWithAndEndsWith() {
        // NOTE: case sensitive
        System.out.println("abc".startsWith("a")); // true
        System.out.println("abc".startsWith("A")); // false
        System.out.println("abc".endsWith("c")); // true
        System.out.println("abc".endsWith("a")); // false
    }

    private static void stringContains() {
        // NOTE: case sensitive
        System.out.println("abc".contains("b")); // true
        System.out.println("abc".contains("B")); // false
        // NOTE: convience method so you don't have to write str.indexOf(otherString) != -1
    }

    private static void stringReplace() {
        // String replace(char oldChar, char newChar)
        // String replace(CharSequence oldChar, CharSequence newChar)

        System.out.println("abcabc".replace('a', 'A')); // AbcAbc => 1 signature
        System.out.println("abcabc".replace("a", "A")); // AbcAbc => 2 signature

        // NOTE: CharSequence is a general way of representing multiple classes like String and StringBuilder
        // https://docs.oracle.com/javase/7/docs/api/java/lang/CharSequence.html
        // https://stackoverflow.com/questions/11323962/exact-difference-between-charsequence-and-string-in-java
    }

    private static void stringTrim() {
        System.out.println("abc".trim()); // abc
        System.out.println("\t    a b c \n".trim()); // a b c
    }
}
