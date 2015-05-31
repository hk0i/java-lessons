# Assignment for Lesson 3 - Arrays, Conditionals and Loops

## Instructions

In class we talked about Arrays, Conditionals and Loops.
Here are some assignments to help you practice what you've learned.

Some exercises may require checking variable values. Currently, we aren't taking
any user input so don't worry about that; for now you can update the variable
values in the code and rerun the program.

For each exercise, create a new program and git repository. Some exercises may
have multiple parts. For each part you will create a separate commit in git.

**Extra credit**: For extra points, use a `git tag` for each part of the
exercise. You can name the tags according to the question number.

Ex:
```
git tag 3b
```

To create a tag for question 3, part b.

If you're interested, read more on [tagging versions][] in git.

*If you use git tags, feel free to make as many git commits as you like! Just
remember the tag is added __after__ your final commit for that step.*

Steps which are labeled `X`, for example `1X` are extra credit steps. You get
brownie points for doing these but they may require a little bit of extra effort
and research.

## 1. Pass or Fail (if-then)

### 1A. Simple Boolean Pass/Fail
Create program called **PassFail**.
The program should print `"Passed!"` if a
`boolean` variable is set to `true` and print `"Failed!"` when the variable is set
to false.

### 1B. `int` Pass/Fail
Commit your changes from the previous step if you haven't already. Optionally,
you can tag the changes after you saved them.

Modify **PassFail** to check the value of a number, `int score`. If `score` is
higher than 70, print `"Passed!"` otherwise print `"Failed!"`.

For this step you will have to change some variables and your if statement.

## 2. You Don't Even! Odd or Even? (if-then)

Write a program called **YouDontEven** to check the value of a number, `int
number`. If `number` is odd, print `"odd"`, if `number` is even, print `"even"`.

*Hint: to check if a number is even you can use the modulo operator `%`. Modulo
is used similar to `/` for division, except that it returns the remainder. So
__if `number % 2` is `0` then it is even.__*

## 3. Numbers to Words (if-then)

### 3A. Say Numbers

Write a program  **SayNumbers** to convert numbers into words. Given a number,
`int number`, print out its value as a word. `"one"` for `1`, `"two"` for
`"two"`, etc. Do this for numbers 1-10 only.

### 3B. Check for unknown numbers

If `number` is not between 1-10, print `"Unknown number: Sorry, I don't know
that number"`.

### 3X. Switch-case

**Extra credit** In class, we didn't talk about `switch` statements. For extra
credit do some reading about [switch statements][] and convert your 3A program
from using an if-then to a switch statement.

## 4. Re-Pete (loops)

### 4A. Hey Pete!
Write a program **RePete** that will print out `"Hey Pete!"` 10 times. Use a
loop.

### 4B. Hey You!
Change the program in 4A to replace the name `Pete`, with a variable `String
name`. `name` should hold the value of your name.

## 5. FourtyOne (loops)

### 5A. Sum 41

Write a program **FourtyOne** which calculates the sum of the numbers 1 - 41.
This would be the same as doing 1+2+3+4... All the way to 41.

### 5B. Average 41

Modify the program in 5A to also print the average of those numbers.

## 6. Months! (if-then, arrays)

### 6A. Months (if-then)
Write a program **Months** that will take a number, `int month` and print out
the name of the month. For example `1` will print `January`, `2` will print
`February`, and so on. You can use an if statement or a switch case.

### 6B. Array of Months!
Refactor your code in 6A to change the conditional to an array. *Hint: create an
array of months.* There should be no if-then or switch statements in this
solution.

### 6X. That's not a month!
What happens if `month` is `0`? What *should* happen? These are common problems
that come up in programming. Can you come up with a solution?

## 7. Array-verage (arrays, loops)

Create a program, **ArrayVerage**, that will compute the average of the
following numbers: `5`, `20`, `18,`, `1`, `9000`, `4`. Store these numbers in an
array.

## Hints

If you're stuck, check out these hints they should help you get started on your
assignment.

### 1A. Pass or Fail (if-then)

```java
/**
 * PassFail.java
 */
public class PassFail {
    public static void main(String[] args) {
        boolean pass = true;
        if ( /* check something ... */ ) {
            System.out.println( /* print something ... */ );
        }
        else {
            System.out.println( /* print something different ... */ );
        }
    }
}
```

### 2A. You Don't Even! (if-then)

```java
/**
 * YouDontEven.java
 */
public class YouDontEven {
    public static void main(String[] args) {
        int number = 5;
        if ( /* number is even */ ) {
            System.out.println( /* ... */ );
        }
        else {
            System.out.println( /* ... */ );
        }
    }
}
```

### 3A. Numbers to Words (if-then)

```java
/**
 * SayNumbers.java
 */
public class SayNumbers {
    public static void main(String[] args) {
        int number = 4;
        if (number == 1) {
            System.out.println( /* ... */ );
        }
        else if (number == 2) {
            System.out.println( /* ... */ );
        }
        /*
         * add as many else ifs as you need
         */
        else {
            System.out.println( /* ... */ );
        }
    }
}
```

### 4A. Hey Pete!

```java
/**
 * RePete.java
 */
public class RePete {
    public static void main(String[] args) {
        for ( /* something */ ) {
            System.out.println( /* something */ );
        }
    }
}
```

### 5A. Sum 41 (loops)

```java
/**
 * FourtyOne.java
 */
public class FourtyOne {
    public static void main(String[] args) {
        int sum = 0;
        int highestNumber = 41;
        for (int i = 0; i < highestNumber; i++) {
            /* do somerthing with sum */
        }

        System.out.println("Sum of all numbers is: " + sum);
    }
}
```

### 6A. Months! (if-then)

```java
/*
 * Months.java
 */
public class Months {
    public static void main(String[] args) {
        int month = 3; // 3 is "March".
        String monthWord = "";

        if (month == 1) {
            monthWord = "January";
        }
        else if ( /* ... */ ) {

        }
        /*
         * Add as many else ifs as you need
         */

        System.out.println(monthWord);
    }
}
```

### 7A. Array-verage

```java
/**
 * ArrayVerage.java
 */
public class ArrayVerage {
    public static void main(String[] args) {
        int sum = 0;
        int[] numbers = {
            5,
            20,
            18,
            1,
            9000,
            4
        };

        for (int i = 0; i < numbers.length; i++) {
            /* do something :) */
        }

        System.out.println("Sum of numbers is " + sum);
    }
}
```


[switch statements]: http://www.homeandlearn.co.uk/java/java_switch_statements.html
[tagging versions]: http://githowto.com/tagging_versions


