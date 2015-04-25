# Lesson 3 - Arrays, Conditionals <del>and Loops</del>

# Arrays

An **array** is an object that holds a fixed number of values of a single type.
For example, an array of 10 `int`s would hold values of type `int` and be
limited to a maximum of 10 values. If you wanted to add an 11th item, that's too
bad you need a bigger array.

Each item in an array is called an **element**. Each element in an array can be
accessed using its numerical **index**. In *Java*, array indices begin with the
number 0. So the first item in the array is actually the 0th item.

## How do we create an array?

Creating an array is similar to creating any other variable. In fact, you can
easily "convert" a regular variable into an array. For example, how do we create
an integer in java?

```java
int age;
```

Let's say instead of one age, we want a bunch of ages.

```java
int[] ages;
```

We can do the same thing, with `String`, for example:

```java
String name;
```

becomes:

```java
String[] names;
```

So, the formula for an array is:  
**type** + [  ] + variableName;

```java
byte[] variableName
```

## Declaration vs. Assignment
Arrays, like any other variable in java can be **declared** and **assigned
values**. These are two separate operations, but thus far we have typically seen
them as a single line of code:

```java
int age = 28;
```

The declaration of the variable, is the first part (`int age`) and the assignment
is the part where we assign a value to the variable (`age = 28`). If we split it
into two lines of code, it would look like this:

```java
int age;
age = 28;
```

However, if we know the value of the variable at the time that we create it, we
can easily combine them into a single line (as shown in the original example).

The `=` is called the **assignment operator**. That's because the equals sign,
*assigns* the value to the variable. Whenever you see something like `age = 28`
you should read it out loud as "age is assigned the value of 28". It may seem
like a lot of words, but it will help you understand *if statements*, which
we'll cover later today.

## Assigning values to an array

When creating an array, we need to make room for the array, this called
**allocating memory**. Every time you see the **new** keyword in java, it's
allocating memory. For example when creating an array, we'll do something like
this:

```java
int[] ages = new int[3];
```

The part where we *assign* the **ages** variable to a `new int[3]` is where we're
telling java that we want a new *array of `int` with 3 available spaces*.

You may have noticed that we haven't added any values to the array yet, we just
allotted some space for it (3 spots, to be exact).

We mentioned earlier that to access the elements of an array, you can use the
same square bracket notation that you used to create the array, and supply the
*index* or *subscript* of the array. For example to add the first age to the
ages array:

```java
ages[0] = 28;
```

To get the value back out you can use the same notation again, but without the
assignment (no equals sign):

```java
System.out.println("age 1: " + ages[0]);
```

If you just wanted the value of an array element but you don't want to print it
out, you can just store that value into another variable:

```java
int firstAge = ages[0];
```

and you can also do the opposite:

```java
int gregsAge = 28;
int tomsAge = 27;
int miguelsAge = 24;

int[] ages = new int[3];
ages[0] = gregsAge;
ages[1] = tomsAge;
ages[2] = miguelsAge;
```

# Conditionals

Conditionals are a type of *control statement*. **Control statements** dictate
how your program should react in a certain situation; you could say they
*control* the flow of your program. Example:

***If** Link has 0 hearts, **then** he dies.*  
Okay he doesn't die, but you hear the funny music
and you gotta start over again.

This is an example of an *if statement*.

## if statement
The **if statement** also known as *if, then...* is a construct to help control
the flow of your application. When a certain *condition* is set, the program
will respond in a specified way. Examples:

```java
if (age < 18) {
    System.out.println("Jailbait.");
}
```

another example:

```java
if (name.equals("Gregory")) {
    System.out.println("You're probably really cool. ;D");
}
else {
    System.out.println("... You're probably not... cool");
}
```

### How do we write an if statement?

Start with the word **if**, followed by a set of parentheses and inside is
what's called a **test**, this is the part of the if statement that defines the
*logic* we will use, after the close paren is an open curly bracket. Then a
close bracket. In between the curly brackets is some code that we want to run
when we meet the condition of our test.

Basic anatomy of an if statement:

```java
if (/* condition */) {
    //then do something
}
```

From the previous section we talked about *If Link has 0 hearts, then he dies.*
In code it *could* look something like this:

```java
if (link.hasNoMoreHP()) {
    game.restart();
}
```


# Questions from Class

## Can an array have different types of variables?

No. An array is homogeneous. All objects in an array have to be of the same type.
However, if you have an array of type `Object`, you can have mixed objects in
the array.  
This is highly discouraged in most cases.


## What can I do with this "array?"

You can store a bunch of stuff. For example if I want to collect a list of
ages from a group of people and I don't care what there names are or whatever, I
can use an array. The advantage being that I don't need 10 separate variables
for 10 ages, I just use a single array, a single variable.
