# Lab8-Turtle-Project-Solo
CSC 175 Lab 8 Turtle inheritance project
# Lab 8 Turtle Artist Project

## About This Project

This project was made for Lab 8 using the provided `Turtle.java` file. The goal of the project is to practice inheritance in Java by creating an abstract parent class and concrete child classes that use the Turtle class in different ways.

The program lets the user choose what they want the turtle to draw. The user can draw a square, a spiral, or both. The program also asks for input, so the drawing can change depending on what the user enters.

The provided `Turtle.java` file was not modified.

## Files in This Project

[ `Turtle.java` ] --> The provided Turtle class used for graphics.

[ `TurtleArtist.java` ] --> The abstract parent class for the project.

[ `SquareArtist.java` ] --> A child class that draws a square.

[ `SpiralArtist.java` ] --> A child class that draws a spiral.

[ `App.java` ] --> The main class that runs the program.

## How the Classes Work Together

The main parent class is `TurtleArtist`. This class stores the Turtle object and has methods that both child classes can use, such as moving the turtle, setting its color, and facing the turtle to the right.

`SquareArtist` and `SpiralArtist` both extend `TurtleArtist`. They each have their own version of the `draw()` method. This lets each class use the same parent structure but draw something different.

The inheritance structure looks like this:

```text
[ TurtleArtist ]
      |
      |--> [ SquareArtist ]
      |
      |--> [ SpiralArtist ]