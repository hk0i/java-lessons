# Assignment: Simple Battleship

In this programming assignment we will be using the knowledge we have gained so
far to create a simplified single player version of the game *Battleship*. The
computer will place a single ship that is 1x1 randomly in a 5x5 grid.  The
player will be asked to enter a row, and then a column. If the ship is located
in this position the message "You sunk my battleship!" appears and the player
wins.

## Command Line Fun

Since the game will be played on the command line, we will display a text grid.
An 'O' (capital 'o') will be displayed for a grid position that has not yet been
fired upon, and an 'X' where a missile has been fired

    O O O O O
    O O O O O
    O O O O O
    O O O O O
    O O O O O

The user will then be prompted separately for a row, then a column. If you want
to put them in the same input, that's fine; first get it working with two
separate inputs, like below:

    Enter coordinates:
    Row> 1
    Column> 2

## Rules of the game

A single 1x1 battleship has been hidden on a 5x5 grid. You get 3 tries to guess
the correct coordinates. If the correct location is guessed the message, "You
sunk my battleship!" appears and the game ends. If you miss the message, "You
missed!" appears.

## Problem Solving

Break the big problem down into smaller problems and handle them one at a time.
Try to get the basic functionality working before adding any flair.
You can use this basic outline to get you started:

1. [Print a welcome message](#print-a-welcome-message)
2. [Pick a Random Location for the Ship](#pick-a-random-location-for-the-ship)
3. [Create the Grid](#create-the-grid)
4. [Print the Grid](#print-the-grid)
5. [Get User Input](#get-user-input)
6. [Check for Hit or Miss](#check-for-hit-or-miss)
7. [Check for Bad Input](#check-for-bad-input)
8. [Repeat Turns](#repeat-turns)
9. [End Turn on Win](#end-turn-on-win)
10. [Check for Repeat Guesses](#check-for-repeat-guesses)

### Print a welcome message

Start off by creating a simple welcome message on the screen. For example,
"Welcome to Battleship!"

### Pick a Random Location for the Ship

Even though we may not have a grid yet, we can still pick a random location for
the ship, use `java.util.Random` to select two random numbers (a row and column)
for our ship's location:

```java
int shipRow;
int shipColumn;
```

### Create the Grid
Using the *multi-dimensional arrays* we discussed in class, create a 5x5 grid
and fill each element with the letter 'O', this will be used to display the
locations where we have or haven't fired upon yet.

The array can be **declared** as:

```java
char[][] gameBoard;
```

Don't forget to **allocate** it at some point:

```java
gameBoard = new char[5][5]; // allocates space for a 5x5 array
```

Rather than using a **literal** int value to represent the grid size, we can
define constants to enhance readability:

```java
final static int BOARD_WIDTH = 5;
final static int BOARD_HEIGHT = 5;
```

Then use these constants to define the size of the game board:

```java
gameBoard = new char[BOARD_WIDTH][BOARD_HEIGHT]; // allocates space for a 5x5 array
```

Lastly, you will need a loop to **initialize** the array values, we can use
`BOARD_WIDTH` and `BOARD_HEIGHT` to simplify our code again:

```java
for (int row = 0; row < BOARD_WIDTH; row++) {
    for (int column = 0; column < BOARD_HEIGHT; column++) {
        // assign the grid values to 'O'
    }
}
```

Assuming we fired at 1,3 and missed we can display the following:

    O O O O O
    O O O X O
    O O O O O
    O O O O O
    O O O O O

This approach assumes 0-based indices. You may use 1-based indices, but then you
will have to account for the offset in your code.


### Print the Grid

Write some code to print out our game board. *Hint: you might need a loop or
two.*

It's probably better to write it as a separate method, since we will be printing
out the game board multiple times and it will make our code cleaner.

Here's a method header to get you started:

```java
public static void printGameBoard(char[][] gameBoard)
```

If you get stuck on how to loop through the game board, take a look at how we
filled the 'O's in the previous step.

### Get User Input

Prompt the user for the row and column they want to fire upon and store them in
separate variables:

```java
int guessRow;
int guessColumn;
```

### Check for Hit or Miss

Now we have the `shipRow`, `guessRow`, `shipColumn` and `guessColumn`. If the
locations match, show the message, "You sunk my battleship!" if the locations
don't match then display the message "You missed!"


### Check for Bad Input

Some people might try to shoot a missile straight out of the water into a
location like (6,10) which is not in our 5x5 ocean. Write a check to see if the
location entered is "in bounds" and display a message telling them it's not
a valid coordinate if it's out of bounds.

### Repeat Turns

The user gets 3 tries to guess the right location. What programming constructs
can we use to *repeat* the same chunk of code multiple times?

### End Turn on Win

You may have noticed that if you guess the correct location on the first or
second try, you will still have more tries to guess. This is a little broken,
make sure that the turn ends once the user has guessed the right location.

### Check for Repeat Guesses

Add a check that will tell the user they have already guessed the same spot if
they guessed it before.

