# Lesson 2 - Variables and Methods

## Variables

Variables hold values. Variables allow us to reuse same values over and also
allow us to get input from the user, and use this elsewhere.

### What types of values can we hold?

1. `int` - used for storing numbers
2. `byte` - also used for storing numbers
3. `short` - also used for storing numbers
4. `long` - also used for storing numbers
5. `float` - used for storing decimal numbers
5. `double` - also used for storing decimal numbers
6. `char` - used for holding a single character (for example `'c'`)
7. `boolean` - used for **true** or **false** values
8. `String` - used for holding a "strand" or **string** of characters.  
    For example `"Honest Bob's Used Cars"`

String is a special type of variable also known as an **Object**. Objects are *defined* using the `class` keyword. More on this later.

#### Example Variables

```java
int x = 4;
byte y = 3;
```

Variable names are *very* important. Normally they should not be single
characters, but words that describe the meaning of that variable.

#### More examples:

```java
String name = "Jordan";
int usersAge = 23;
```

In java, you *must* specify the type of the value that the variable will hold.
In other languages like PHP and python for example, you do not.

Names of variables (and functions) are *very* important in java. For example, at
work there was a function called `isNumberInAddressBook()` which returned a true
or false value. Oddly enough, the function returned **false** when the phone
number was *in* the address book.

### Types of Variables —  CliffsNotes edition

#### Integral types

Integral types (`int`, `byte`, `short`, `long`) are all assigned a number:

```java
int age = 24;
byte x = 3;
```

Notice that the numbers do not contain decimals.

#### Floating point types

Floating point types (`double`, `float`) can store numbers with decimal points.

```java
float secondsToMeltdown = 23.3;
double heightInInches = 61.3;
```

#### Character type

`char`, the character type holds a single character. To assign a character to a
variable, you have to put the variable in single quotes:

```java
char firstLetterInGregsName = 'G';
```

#### Boolean

`boolean` variables hold values of `true` or `false`:

```java
boolean didThatReallyJustHappen = true;
boolean areYouSerious = false;
```

Booleans do not require any quotes, just type **true** or **false**.

#### String

String is a special type (object) but because String itself is a *special
object* we have a super convenient way of assigning a value to a string:

```java
String nameOfMovie = "Gone in 60 Seconds";
```

### What can we do with variables?

1. We can get input from the user and store it.
2. We can get back the stored values and use them.
3. You can do math
4. You can put strings together, also known as **concatenation**.
   (con-cat-en-ation)

```java
int myAge = 28;
int myNephewsAge = 6;

System.out.println("My age is " + myAge);
System.out.println("My nephew's age is " + myNephewsAge);
System.out.println("The difference between our ages is: " 
    + (myAge - myNephewsAge));

```

The above code will output:

```
My age is 28
My nephew's age is 6
The difference between our ages is: 22
```

## Functions, or as java calls them, Methods.

In programming a function is a bit of code that *does something*. It performs an
action, or multiple actions and the function can *invoked* wherever we need
that bit of functionality.

For example,

```java
public void sayMyName() {
    System.out.println("Gregory");
}
```

This is a function that prints my name. It's not incredibly useful, but any time
that I want my name to appear on the screen, I can *invoke* or *call* the
function `sayMyName` like so:

```java
sayMyName();
```

And if I wanted you to say my name **10** times, I could do *this*:

```java
sayMyName();
sayMyName();
sayMyName();
sayMyName();
sayMyName();
sayMyName();
sayMyName();
sayMyName();
sayMyName();
sayMyName();
```

... and there are better ways to do this repetition, known as *loops*.
We'll get to those later.

## Types of Functions

Just like variables have different *types* java methods *also* have different
types. Luckily, they are the same types, so they are really easy to remember.

Methods in java come in two different forms, methods that **return** values, and
methods that do not. Methods that *do not* return values are called `void`.

Where have we seen *void* before?

Right! It's in `public static void main(String[] args)`

### What does `void` mean exactly?

It means the function is going to do a bunch of stuff, and that's it. It's not
going to give us any values back.

### Examples of functions

```java
public void sayMyName() {
    System.out.println("Gregory");
}
```

This is another example of a *voided* function. It prints my name, that's it.

We could make functions give us back values, for example to calculate the
sum of two numbers, we could say:

```java
public int sumOfTwoNumbers(int number1, int number2) {
    return number1 + number2;
}
```

This introduces *two* new ideas.

1. The function can return a value back.
2. The function can take values in.

So you can say that the function has an **input** and an **output**.
This function takes in two numbers, then adds them and *returns* the sum.

To use this `sumOfTwoNumbers` function, for example, you could do the following:

```java
int sum = sumOfTwoNumbers(2, 8);
```

You place the parentheses after the name of the function, followed by the
function's **parameters**, which are variables that we defined above when we
wrote `int number1, int number2`. The `2` and `8` refer to the variables
named `number1` and `number2`, respectively.

### The return statement

`return` is the keyword you use when you want to leave the function. This is
called a **return statement**. Return statements can also return values, in a
**non-voided function**.

# How do we Use Variables and Functions? I just wanna code!

Take your homework assignment from lesson 1, let's start introducing variables
and functions. We're also going to start using `git` (uh-oh!).


## Move your code to a new folder

Before we do anything, take your assignment (the `HiMyNameIs.java` file) and put
it into its own folder. On the command line you can create a new folder using
the `mkdir` command. It's short for **make directory**:

```sh
mkdir 2-hi-my-name-is
```

This will create a directory called `2-hi-my-name-is` in the current directory
you're in, then you can move your java file using the `mv` command. `mv` means
**move**:

```sh
mv HiMyNameIs.java 2-hi-my-name-is
```

This moves `HiMyNameIs.java` into the new directory we created.

## Create a git repository and add your code

To create an empty git repository, type the following command in your new
directory:

```sh
git init
```

It should say something like:

```
Initialized empty Git repository in /home/your-home/your-folder/.git/
```

Then, add the java file by typing:

```sh
git add HiMyNameIs.java
```

After adding the java file to the git repository, we need to specify that we
want to *save* or **commit** this change:

```
git commit
```

a vim window should open up asking you to enter a commit message. Go into insert
mode (<kbd>i</kbd>) and type "initial commit", then save the file with
<kbd>:wq</kbd> to get some similar output from git:

```
[master (root-commit) 37291bb] initial commit
 1 file changed, 13 insertions(+)
 create mode 100644 HiMyNameIs.java
```

## Let's make our first change together

For our first change, let's take out some of the **hard-coded** values in our
`HiMyNameIs` application and put them into **variables**.

For me, my code looks like this:

```java
public class HiMyNameIs {

    public static void main(String[] args) {
        System.out.println("Hi, my name is Gregory.");
        System.out.println("I am 28 years old.");
        System.out.println("I enjoy long walks on the beach and pina coladas");
    }

}
```

... Yours might look different. In this example, some of the things we will put
into variables are:

1. My name
2. My age
3. My interests

### What types of variables should we use?

\# | variable  | type
-- | --------- | ------
1  | name      | String
2  | age       | int
3  | interests | String

For now, each interest can be a separate string. We will come back to this in a
later exercise (probably after next lesson).

### First, make the `name` variable

First, pull out your name from the first line and put it into a variable. You
can output it using the `+` to join the `name` variable with the rest of the
message, remember to close the double quotes before using the `+` operator.

```java
public class HiMyNameIs {

    public static void main(String[] args) {
        String name = "Gregory";

        System.out.println("Hi, my name is " + name + ".");
        System.out.println("I am 28 years old.");
        System.out.println("I enjoy long walks on the beach and pina coladas");
    }

}
```

Compile and run your program. The output should be the same as when you first
ran it.

Now for practice, let's add the change into git. But before we add, we can
review our changes in git using the `git diff` command.
You should see something like this

```diff
diff --git a/HiMyNameIs.java b/HiMyNameIs.java
index 536dfca..5012ec9 100644
--- a/HiMyNameIs.java
+++ b/HiMyNameIs.java
@@ -1,7 +1,9 @@
 public class HiMyNameIs {

     public static void main(String[] args) {
-        System.out.println("Hi, my name is Gregory.");
+        String name = "Gregory";
+
+        System.out.println("Hi, my name is " + name + ".");
         System.out.println("I am 28 years old.");
         System.out.println("I enjoy long walks on the beach and pina coladas");
     }
```

If the output is too long to fit on your screen you'll see a `:` in the bottom
left, you can use the <kbd>q</kbd> key to quit. If everything fit just fine
then you won't have to.

What this is doing is showing us the differences between the last time we
committed our change to now.

This is called a **diff**.

The lines that begin with a `-` were **removed**, and the lines that begin with
a `+` have been **added**. Lines that have **changed** are represented by a deleted
line followed by an added line.

By looking at the diff, we can tell what changes we've made to our files
*before* committing (saving) these changes.

Now that our changes look good, we can commit. Occasionally you'll spot
something in the diff that doesn't look right, so it's always good to review
the diff before you commit. This way you can fix any mistakes you might not
have noticed.

Add the changes from the file by using:

```
git add HiMyNameIs.java
```

This is the same command we used to add the entire file, but this time the
`add` command is going to add only the changes we made to that file.

Then type:

```
git commit
```

To commit the file. vim will open again and ask you for a commit message.
Put in a helpful message like "moved name into its own variable." Then save,
and quit.

### Next, we'll move age

Now move age out into its own `int` variable:

```java
public class HiMyNameIs {

    public static void main(String[] args) {
        String name = "Gregory";
        int age = 28;

        System.out.println("Hi, my name is " + name + ".");
        System.out.println("I am " + age + " years old.");
        System.out.println("I enjoy long walks on the beach and pina coladas");
    }

}
```

Compile and run. The output should *still* be the same:

```
Hi, my name is Gregory.
I am 28 years old.
I enjoy long walks on the beach and pina coladas
```

Now add and commit the new changes into git:

```
git add HiMyNameIs.java
git commit
```

Add your commit message, and <kbd>:wq</kbd> to finish the commit. Another short
way to save & quit in vim, is to press <kbd>ZZ</kbd> (uppercase ZZ) in normal
mode.

### Now let's put hobbies into variables

The next thing we'll do is move the hobbies into their own separate variables.
For this we'll give each hobby its own `String` variable.

My code now looks like this:

```java
public class HiMyNameIs {

    public static void main(String[] args) {
        String name = "Gregory";
        int age = 28;
        String hobby1 = "long walks on the beach";
        String hobby2 = "pina coladas";

        System.out.println("Hi, my name is " + name + ".");
        System.out.println("I am " + age + " years old.");
        System.out.println("I enjoy " + hobby1 + " and " + hobby2);
    }

}
```

Compile and run. The output should *still* be the same. *WHY ARE WE EVEN DOING
THIS?!*

Well that's why

# Questions from Class

## Why does `System.out.println()` use parenthesis?

Because it's a function. The function has parenthesis, the string has quotes.

### What is a function?

A function does stuff.
In this case, it shows some text on the screen.

## Why do you have to specify the type of variable

This is part of java. It makes java what they call a *strongly typed language*

One example of when you might want a variable to be one type or another would be
to have a variable representing *age*, where you would only want whole numbers (no
 decimal places) or pixels, where you can't have half a pixel.

Another example would be asking a user for their age and then they enter their
name (example, "Bob") now when you show age on the screen, it will show "Bob."

## How do you use the variables you create?

That really depends on how you want to use it, but for example if you wanted to
just print it out on the screen you could something like this:

```java
int numberOfEggsInMyEasterBasket = 41;
System.out.println("I have "
    + numberOfEggsInMyEasterBasket + " eggs in my easter basket");
```

This would generate:

```
I have 42 eggs in my easter basket
```

## Does the order of `public class Age` matter?

Yes. It has to be in the order `public` first, then `class`.

`public static void main(String[] args)` however, can be changed to
`static public void main(String[] args)`, but this is less common. So don't do
it ;)

## What is *syntax*?

Syntax is literally the order the words appear in, but it could also include
things like where it's okay to put parenthesis and quotes, where semicolons and
curly braces should appear, etc.

## Is `sumOfTwoNumbers()` a predefined function or did you make that up?

I totally made that up.

## In the example for `sumOfTwoNumbers()` if you passed 3 number instead of 2 would it crash?

Sort of. It wouldn't *crash* the program, but the program won't compile.

Try doing it on your own to see what it looks like. Copy the function from the
example into a file and then call the function with 3 parameters instead of 2.

If you're trying this example, remember that **static** methods (i.e., public
**static** void main) can only call other **static** methods. So make sure to
put **static** in sumOfTwoNumbers:

```java
public static int sumOfTwoNumbers(int number1, int number2) {
    return number1 + number2;
}
```

## What are Untracked Files in git?

Untracked files are files that are not under git supervision. Git won't notice
any changes that you make to these files.

For example `.HiMyNameIs.java.swp`, `HiMyNameIs.class` and `HiMyNameIs.java~`
might show up. What are these files and should they be in git's "version
control?" The swap file (`*.swp`) and the ~ file (`*~`) are temporary files
from vim, they will disappear when you close the files in vim.
The `.class` file is generated when we run `javac`, and it's a binary file. We
don't want that in our git either.
