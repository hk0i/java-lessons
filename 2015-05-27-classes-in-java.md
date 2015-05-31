# Lesson 6 - Classes

A **class** defines an *object*. In java, objects are composed of properties,
also known as *fields* and functions which are also known as *methods*. A
**field** in java is a variable that belongs to a class and can be accessed
anywhere within that class. This is different from a **local variable**, which
can only be used from within a single function.  Up until now we've really only
been using local variables and methods in a single class, more complex java
programs are written using many classes.

## Hey wait, that doesn't make any sense

Let's look at an example. A person could be represented as a java object. To
begin, we have to think about the traits of that object. What does a person
*have*?  A **Person** could be described as having a **first name**, **last
name**, **date of birth**, **height** and **eye color**. Of course there are
many other things that could go into consideration here but we're not going to
be pumping out any humans in java anytime soon, for the purpose of this class.
In this case the class name could be `Person` and its fields could be
`firstName`, `lastName`, `dateOfBirth` `height` and `eyeColor`.

Since our `Person` class represents simple object—we all know how simple humans
are—we can call this a **model class**.

## How would we express that in *code*?

Previously all of our past projects and assignments have been a *single* class,
and *single* file and in many cases a *single* function. Going forward we'll
start to use *multiple classes* in *multiple files*. So make sure to create a
new folder for each program, or the files will get very messy.

```
mkdir PersonExample
cd PersonExample
vim Person.java
```

Then in Person.java:

```java
public class Person {
    private String firstName;
    private String lastName;

    private String dateOfBirth;
    private double height;
    private String eyeColor;
}
```

As it stands right now, the `Person` class is a class that has nothing but
private fields.

## What does *private* mean?

Private means that only the functions inside the same class
can see or manipulate the values in these variables. Functions can also be
*private*. Private functions can only be called from within the same class.

To illustrate how the `private` works, let's try to compile and run our program.

```
javac Person.java && java Person
```

If you did everything right, you'll encounter is this familiar message:

```
Error: Main method not found in class Person, please define the main method as:
   public static void main(String[] args)
```

*Usually* to fix this we would open up `Person.java` and add the main method.
*This time*, we'll do things differently. Since we'll be creating programs using
multiple files now, let's create a new file for our main method.

## A separate file for the main method

In most main stream java code, the main method gets its own class, but what
should we call it? A few common conventions are to pick names like `Main`,
`Application`, `XLauncher`, or just `X` where `X` would be the name of the
program. Let's name it after our program, I'll use `PersonExample`. This name is
more explicit so it will help reduce confusion because on the command line you
would use `java PersonExample` to run the program, instead of a more vague `java
Application`

Now create `PersonExample.java` and add the main method:

```java
public class PersonExample {
    public static void main(String[] args) {
        
    }
}
```

I'll refer to this file going forward as the **main class**.

## Creating our first `Person`

Now that we have a main class, `PersonExample`, and model class, `Person`, let's
create our first person. So... How do we do that?

Simple! We declare a new variable just as we would with any other data type.
This time the *class name* is data type. This means we can **declare** a new
person using the `Person` class name:

```java
Person person
```

To create a new copy or **instance** of a Person, we use the `new` keyword, followed
by the class name and a set of `()` which will be explained below.

```java
Person person = new Person();
```

*Note: this is one of the main reasons why in java you want your class names to
start with an uppercase letter. It will help you distinguish the native data
types (`int`, `boolean`, `byte`, `double`, ...) with custom created data types
such as our `Person`.*

```java
public class PersonExample {
    public static void main(String[] args) {
        Person miguel = new Person();
        Person thomas = new Person();
        Person gregory = new Person();
    }
}
```

Now compile and run. Since we have multiple files it's best to specify all files
in a list to `javac`:

```
javac Person.java PersonExample.java
```

But to run, we only need to reach out to the main class, since it houses our
main method:

```
java PersonExample
```

Nothing happens. That's because we didn't do anything yet with our Persons.
Let's try to access some of their information:

Add this to your main method:

```java
System.out.println(miguel.firstName);
System.out.println(thomas.firstName);
System.out.println(gregory.firstName);
```

The main class should now look like this:

```java
public class PersonExample {
    public static void main(String[] args) {
        Person miguel = new Person();
        Person thomas = new Person();
        Person gregory = new Person();

        System.out.println(miguel.firstName);
        System.out.println(thomas.firstName);
        System.out.println(gregory.firstName);
    }
}
```

Compile and run:

```
javac Person.java PersonExample.java && java PersonExample
```

*Note: we **don't have to** compile Person.java again since it hasn't changed,
but this might be safer for now so we can reuse the same command later and there
aren't a whole lot of files involved anyway*

If you did everything right you should get the following output:

```
javac Person.java PersonExample.java && java PersonExample
PersonExample.java:7: error: firstName has private access in Person
        System.out.println(miguel.firstName);
                                 ^
PersonExample.java:8: error: firstName has private access in Person
        System.out.println(thomas.firstName);
                                 ^
PersonExample.java:9: error: firstName has private access in Person
        System.out.println(gregory.firstName);
```

Java's complaining because we're trying to access some private information in
Person. Since we don't just go around flailing around our private parts in java,
we get an error when we try to look at someone's private parts directly.

There are two ways to fix this:

1. Make the private parts `public`
2. Create **accessor** methods to allow us to view the private parts

Generally, the second option is preferred. When we create private variables and
methods that allow us to access these private variables from outside of the
class this is known as **encapsulation**.

Update the `Person` class to add new *accessor* methods:

```java
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public double getHeight() {
        return height;
    }

    public String getEyeColor() {
        return eyeColor;
    }

```

Generally as you can see here, accessor methods usually begin with the word
*get*. This is a convention that informs the developers working with this code
that this function will give us a value to a private variable.

Update the main class also to use our new methods instead of the private
variables we had before. Remember that these are methods and require the `()`:

Compile, run and look at the results:

```
javac Person.java PersonExample.java && java PersonExample
null
null
null
```

It prints out `null` 3 times. This is because we didn't set our names for any of
our Person objects yet. Since those variables are `private`, we can't set them
directly. This means we need the help of another method in the `Person` class.
Again we have some choices.


1. ~~Make the variables public!~~ (we already rule this one out last time, eh?)
2. Add a *mutator* method: create a method to change the value of the variables for us.
3. Add a *constructor*: create a special method that will set the value of the variables when the
Person object is created.

Since we already ruled out making the variables public for the sake of
illustrating proper encapsulation, we have two real choices. Option (2) makes a
lot of sense and it's probably how most people would approach the problem.
Rather than doing this, however, I'd like to illustrate another means of
encapsulation: option (3).

In option (3) we create a method known as a *constructor*. A **constructor** is
a method that runs when a new object of that class is created, among other
things this is a great time to set up default values for our variables.

In `Person.java`, add a constructor. A constructor is a method with a somewhat
special signature: `public` followed by the class name, for example: `public
Person()`:

```java
public Person(String firstName) {
    firstName = firstName;
}
```

In this case we also provide the person's first name, then inside the function
we set it. But wait! Isn't `firstName` the name of our private variable? How can
you set `firstName = firstName`? Does that even make sense?

Well... No, not really. It doesn't make sense. Different people have different
ways to handle this. The most obvious way to handle this situation is to rename
one of our variables so that way we can say `firstName = otherFirstName` or
something of the sort, but even that isn't too clear.

## Private variable naming convention
Usually private variables in java are prefixed with something to add extra
significance to point out that they are private. For the purpose of this course
we'll use `my` as a prefix.

Refactor your `Person` class. Rename your `private String firstName` field to
`private String myFirstName`, and update the other private fields to reflect the
same naming convention. This is what it should look like now:

```java
public class Person {
    private String myFirstName;
    private String myLastName;

    private String myDateOfBirth;
    private double myHeight;
    private String myEyeColor;

    public Person(String firstName) {
        myFirstName = firstName;
    }

    public String getFirstName() {
        return myFirstName;
    }

    public String getLastName() {
        return myLastName;
    }

    public String getDateOfBirth() {
        return myDateOfBirth;
    }

    public double getHeight() {
        return myHeight;
    }

    public String getEyeColor() {
        return myEyeColor;
    }
}
```

## Update Main Class
Now that we've created a new constructor that requires us to give a first name,
we have to update our main class so that we create all `Person` objects with a
first name:

```java
Person miguel = new Person("Miguel");
Person thomas = new Person("Thomas");
Person gregory = new Person("Gregory");
```

Compile and run and you should get the following output:

```
javac Person.java PersonExample.java && java PersonExample
Miguel
Thomas
Gregory
```
