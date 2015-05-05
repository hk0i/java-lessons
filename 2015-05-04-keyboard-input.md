# Lesson 5 - User Input

Our programs so far have been pretty useless. If you've noticed the trend has
been to control the flow of the program by checking some variables, but in order
to change the values in these variables, we had to make a code change and
compile the code again.

Fear not, today we are learning how to take input from the users of our programs
to make our programs a little more interesting and useful.

## Importing in Java

Today we're going to see something we have never seen before. The `import`
statement. `import` allows us to add or *import* new functionality into our
program from somewhere else. In our case here, we want our users to be able to
able to enter information into our program. To do that we will use
`java.util.Scanner`.

So far the first line of every program we've created has been
`public class SomethingOrOther`. When using `import`s, the import statements are
the first lines in the program

## The `Scanner` Class

Scanner class allows us to pull in *typed values*—values of type `int`, or
`double` or `String` for example—from the keyboard and use them in our program.
We can also store these values in variables and do whatever we please with them.

### Useful Methods in Scanner

 Method Name  | Short Description
------------- | --------------------
hasNextInt()  | Checks if the next "thing" (token) we type in is an `int`.
nextInt()     | gets us the next `int` entered
nextLine()    | gets the entire next line
hasNext()     | checks for another String (single word)
next()        | returns the next word from the input

Read the full [java.util.Scanner javadoc][] for more information about other
methods in scanner.

[java.util.Scanner javadoc]: http://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html#method_summary

## Grabbing input with Scanner

We said earlier that Scanner is really good at getting us typed information,
`int`s, `double`s, `String`s and so on. Here's an example of how we can get an
integer using Scanner.

For this, let's create a new demo program called `UserInput.java`

First, `import java.util.Scanner`:

```java
import java.util.Scanner;
```

Next, continue like the rest of the programs we've made, by adding the class
definition and main method:

```java
public class UserInput {

    public static void main(String[] args) {

    }

}
```

Then inside the main method, create a new `Scanner` object:

```java
Scanner input = new Scanner(System.in);
```

Now that we have a scanner object pointing at `System.in`—the keyboard
input—let's get some input:

```java
int age = 0;
age = input.nextInt();
System.out.println("You are " + age + " years old.");
```

Here we create the variable `age` as an `int`, and assign it a default value of
`0`, then we use our Scanner object, which we called `input`, to get the next
integer value from our keyboard input.

As you probably noticed, the program just sits there waiting for input without
saying a thing. Let's change that previous block of code to add an output:

```java
int age = 0;
System.out.println("How old are you?");
age = input.nextInt();
System.out.println("You are " + age + " years old.");
```

Now the program will ask you for your age:

```
How old are you?
23
You are 23 years old
```

## Exceptions

When you type something that's not an integer what happens?

```
How old are you?
Bob
Exception in thread "main" java.util.InputMismatchException
	at java.util.Scanner.throwFor(Scanner.java:909)
	at java.util.Scanner.next(Scanner.java:1530)
	at java.util.Scanner.nextInt(Scanner.java:2160)
	at java.util.Scanner.nextInt(Scanner.java:2119)
	at ScannerDemo.main(ScannerDemo.java:11)

shell returned 1
```

This is an `Exception`. Exceptions are *thrown* when something we aren't
expecting to encounter happens.

### How do we avoid Exceptions?

Generally, there are two ways to avoid exceptions. One is to use a `try catch`
block which will *try* to do something and then *catch* the exception if it
fails, or sometimes you can use `if` statements to prevent the exception from
happening in the first place.

`if` statements tend to work better, but sometimes you absolutely *must* use a try
catch.

Let's try with an if statement:

```java
int age = 0;

System.out.println("How old are you?");
if (input.hasNextInt()) {
    age = input.nextInt();
    System.out.println("You are " + age + " years old.");
}
else {
    System.out.println("That wasn't a number!!!");
}
```

Try entering a String again:

```
How old are you?
asd
That's not a number!!!
```

This is great! But the program dies immediately after it gets the wrong input.
Wouldn't it be great if it didn't do that?

Let's use a loop!

## Looping for input

We can more or less force our users into giving us what we want by throwing them
into a loop. How can we loop this?

Here's the solution we came up with in class:

```java
import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = 0;

        do {
            System.out.println("How old are you?");
            if (input.hasNextInt()) {
                age = input.nextInt();
                System.out.println("You are " + age + " years old");
            }
            else {
                System.out.println("That's not a number!!!");
                input.nextLine();
            }
        } while(age == 0);
    }

}
```

Here's another example of a different solution that uses a while loop instead of
a do loop:

```java
import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = 0;

        System.out.println("How old are you?");
        while (!input.hasNextInt()) {
            System.out.println("That's not a number!!!");
            System.out.println("How old are you?");
            input.nextLine();
        }

        age = input.nextInt();
        System.out.println("You are " + age + " years old");
    }

}
```
