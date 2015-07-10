# Classes Part 2

Last time we began talking about classes and how they can be used, but we didn't
exactly finish what we were doing. Today we'll work more with classes by
finishing the project from last class and coding a few examples together.

If we compile and run the output from last week's program we get the following:

```
javac *.java && java PersonExample
Miguel
Thomas
Gregory
```

If you recall we were able to create new Person objects by using our `Person`
class:

```java
Person miguel = new Person("Miguel");
```

Where we pass in the first name as an argument to our constructor in the Person
class.

## Default Values in Constructors

Since we were in a rush we actually weren't too thorough with our constructor.
Typically constructors will initialize all fields in a class to appropriate
default values. This leaves us with a decision to make: what is an appropriate
default value?

For example, depending on how we want to use our `Person` class, we may or may
not want to give a default name. In the context of video games, perhaps a
similar `Player` class could be created with a `name` field, and perhaps this
`name` field could have a default value of `No Name` or `Player1`, as you may
have seen in games before.

The default value for a String is `null`. Null values can cause a world of pain
in java, so it's probably best to avoid them, wherever possible. Let's modify
our constructor to set default values for when name isn't set. For the String
values we will use an empty string represented by `""`.

```java
public Person(String firstName) {
    //first set the values we do know
    myFirstName = firstName;

    //then set the values we don't know to reasonable defaults
    myLastName = "";
    myDateOfBirth = "";
    myEyeColor = "";
    myHeight = 0.0;
}
```

Let's add a new parameter to our constructor called `lastName`, to allow us to
set the `lastName` field of our class when creating a new `Person`:

```java
public Person(String firstName, String lastName) {
    myFirstName = firstName;
    myLastName = lastName;

    myDateOfBirth = "";
    myEyeColor = "";
    myHeight = 0.0;
}
```

Now to use it we have to update our main class:

```java
public class PersonExample {
    public static void main(String[] args) {
        Person miguel = new Person("Miguel", "Acosta");
        Person thomas = new Person("Thomas", "");
        Person gregory = new Person("Gregory", "McQuillan");

        System.out.println(miguel.getFirstName() + " " + miguel.getLastName());
        System.out.println(thomas.getFirstName() + " " + thomas.getLastName());
        System.out.println(gregory.getFirstName() +  " " + gregory.getLastName());
    }
}
```

Notice how we can no longer use the first name only version of the constructor,
so the instantiations have been updated to include the last names.

## Multiple constructors

That's good, but when we don't know someone's last name (in this example
*Thomas*) we are forced to pass Person's last name anyway, and we provide an
empty string. It was much nicer to be able to specify only the information we
have. In order to do this we can create *another* constructor in the Person
class:

```java
public Person(String firstName) {
    myFirstName = firstName;
    myLastName = "";

    myDateOfBirth = "";
    myEyeColor = "";
    myHeight = 0.0;
}
```

Sweet, now we have two way to make Person objects!
Update the corresponding area of the main class:

```java
Person miguel = new Person("Miguel", "Acosta");
Person thomas = new Person("Thomas");
Person gregory = new Person("Gregory", "McQuillan");
```

Notice how Thomas's last name was removed.

Compile and run.

The output is the same.

What we just made here is what's known as an *overloaded method*, or more
specifically in our case an *overloaded constructor*. An **overloaded method**
is a method which has the same *name* as another method, but a slightly
different *method signature*. The **method signature** is the part of the method
that declares the method, it is composed of a *visibility modifier, return type,
name,* and a set of *parameters*. For example:


```java
public String getFirstName() {
```

`public` is the **visibility modifier**, it tells us who can see this function.
`String` is the **return type**, this tells us that this method is going to
return a `String` and the emptiness that is in between the parenthesis tells us
that there are no parameters being passed into this method.

There's only one problem with the way we handled this, or at least it's a big
problem in my eyes. Let's take a look at our `Person` class:


```java
public class Person {
    private String myFirstName;
    private String myLastName;

    private String myDateOfBirth;
    private double myHeight;
    private String myEyeColor;

    public Person(String firstName, String lastName) {
        myFirstName = firstName;
        myLastName = lastName;

        myDateOfBirth = "";
        myEyeColor = "";
        myHeight = 0.0;
    }

    public Person(String firstName) {
        myFirstName = firstName;
        myLastName = "";

        myDateOfBirth = "";
        myEyeColor = "";
        myHeight = 0.0;
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

Notice how both of our constructors have relatively similar code in them. This
becomes a mess when we want to change the behavior of these methods.

## Code Duplication Hairiness

In general try to keep the amount of code that looks identical to a minimum. If
you're using copy and paste a lot that's a sign that maybe you're doing
something wrong, and it also leaves room for error. In our case the content of
both of these methods is similar. There's a shortcut technique we could use
here.



