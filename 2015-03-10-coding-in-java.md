# `2015-03-10`
*updated 2015-03-12 18:50:46*

## Coding in Java

For this course we will use some very basic tools, customize them and compile
and run java code.

# A Simple Hello World Example, using vim and friends.

To begin, open your **Terminal** app.

On **Linux**, this could be **gnome-terminal, terminator** or **xterm**  
For **OS X** there is **Terminal.app** in the `/Applications/Utilities`
folder or my personal favorite, ** [iTerm 2][]**.

```sh
vim HelloWorld.java
```

This will launch the [Vim][] editor, and open (or create) a new file called
`HelloWorld.java`.

## Why vim?

For the first couple of weeks through this course *at minimum*, we will be using
`vim` as our main editor. This serves several purposes:

1. It will pull you out of your comfort zone—*tremendously*—and prepare you to
    start learning new tools.
2. Learning how to use vim will ensure that you know how to use at least **one**
    command line text editor tool, which will be *very handy* when it comes to
    editing configuration files when we start using **ssh** down the line.
3. vim is ubiquitous. Most *nix systems should have it installed out of the box.


## Naming Conventions

In java everything is **case sensitive** this means that you have to be very
aware of when you use upper case and lower case letters. **Bob** and **bob** may
look similar, but as far as java is concerned, they are definitely not the same
person.

In Java, files are named `SuchAndSuch.java`, always with an **upper camel
case**, where the first letter of each word is capitalized starting with the
first letter, as in **UpperCamelCase**—rather than **lower camel case** which
you will see later, which usually reads as **lowerCamelCase**.

## Creating your first java file

Each java file is also called a **class**. Inside the file, we have to *define*
the class:

```java
public class HelloWorld {

}
```

## the main function

Every program in java has a *main function*.
The **main function** in any program is the **entry point**. It is the first
piece of code that program will execute.

In java, we define the main function as:

```java
public static void main(String[] args) {

}
```


### Short exercise

To illustrate the importance of the main function, let's try to **compile** our
`HelloWorld.java` *without* a main function.

Remove the main function if you added it already, then save the file.

To save the file in vim:  
Press <kbd>ESC</kbd> <kbd>:w</kbd> <kbd>ENTER</kbd>

For now you can use the keyboard shortcut <kbd>CTRL + z</kbd> send vim to the
*background* and return to the command line, and then you can type the `fg`
command to bring back to the *foreground*.

Send vim to the background using <kbd>CTRL + z</kbd> then on the command line,
type:

```sh
javac HelloWorld.java
```

Then **run** it:

```
java HelloWorld
```

Notice how the `.java` from our file name is missing.

When you try to run your program, java *complains*:

```
$ java HelloWorld
Error: Main method not found in class HelloWorld, please define the main method as:
   public static void main(String[] args)
```

Because java is very **safe** it gives us very helpful error messages.
Let's put the main function back into our code:

```java
public class HelloWorld {
    public static void main(String[] args) {

    }
}
```

## "Printing" text on the Screen

To **print**, or *display* text on the screen, we can use the `println`
(pronounced print line) function:

```java
System.out.println("Hello World!");
```

### Why is it `println` (print line) and not just `print`?

The function is print **line** because it adds a line break at the end of
the line.

For example, if we take the following code:

```java
System.out.print("this is a print");
System.out.println("this is a println");
```

Then compile & run, we get the following output:
```
$ javac HelloWorld.java && java HelloWorld
this is a printthis is a println
```

Now that's *super hard* to read.  
**What would happen if we reversed these two
lines so that our code looks like this:**

```java
System.out.println("this is a println");
System.out.print("this is a print");
```

Compile and run our *reversed* code:

```
$ javac HelloWorld.java && java HelloWorld
this is a println
this is a printusername@hostname ~ $
```

You'll notice the last line is smushed into the next line of our command line
output (the prompt). That is because we used `print` instead of `println`.



# Questions From Class

## 1. Why does `String` have to be capitalized?
**String** has to be capitalized because it is a *class*.

The same way that we capitalized our filename (`HelloWorld.java`) and class name
(`public class HelloWorld`), we have to capitalize String.

Classes *describe* objects, an **object** represents a *thing*. Things do stuff. (Duh)  
For example:

A **bottle** is a thing. We could represent a bottle using a `class` called
`Bottle`. The **Bottle** has certain *properties*, such as the **label** and the
**cap**. The bottle also might have functions such as `twistCapOff`, to remove the
cap and `twistCapOn` to put the cap back on.

We will talk more about classes and objects later.

### 1a. Are there any other classes?

*Yes*, There are an infinite number of classes. Every time we write more code in java,
we are adding more classes such as our `HelloWorld` class.

[Vim]: http://www.vim.org/
[iTerm 2]: http://iterm2.com/
