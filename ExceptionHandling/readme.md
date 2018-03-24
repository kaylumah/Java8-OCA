# ExceptionHandling App

## About Exceptions

An exception is an event that alters the program flow. Java has a Throwable superclass for objects that represent these evens. In Java we define two types of exception:
- Error: something your program should not attempt to recover from (Like disk drive disappeard. That is an abnormal condition that is not likely to occur)
- Runtime Exception: Runtime exceptions tend to be unexpected but are not necessarily fatal. Another name for runtime exception is **unchecked excepion**
- Checked exception: includes exception and all subclasses that do not extend runtime exception. Checked exceptions are mostly used for errors that are more anticipated. (like a file that does not exist)

NOTE: Java has the **handle or declare rule** that means that Java requires code to handle the exception or declare them in the method summary.

(Fig 6.1 on page 302).


![Java Exeption tree](https://www.tutorialspoint.com/java/images/exceptions1.jpg)

TODO add rules for different kind of exceptions (SEE BOOK on Table6.1 page 305)

Syntax rules (SEE EXAMPLES IN TryCatchSyntax.java):
- try/catch blocks are required to have { } Java will not compile without.
- a try statement must have a catch and/or finally. having both is fine, having neither won't work. => catch is not required if finally is present (any realistic use case is out of scope for OCA, see page 309)
- there is one exception to the finally block will always run (After try or catch), System.Exit(0)

SEE PAGE 314 till 318 for common exceptions


## Hierarchy

- deterimine if it is a checked or unchecked exception.
- determine if any of the exceptions is a subclass of the others.

In Java there exists a rule for the order of the catch blocks (TODO page 310)
If any of the catch blocks cannot be executed you will receive a compiler error about unreachable code.
This can happen when a superclass is caught before a subclass.


## Usefull links
- https://stackoverflow.com/questions/4559661/java-try-catch-finally-blocks-without-catch

- https://docs.oracle.com/javase/tutorial/essential/exceptions/finally.html 

- https://www.javaworld.com/javaworld/jw-02-1997/jw-02-hood.html