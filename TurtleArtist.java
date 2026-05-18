/**
 * Author: @francescobrillante
 * Lab 8 Turtle Artist Project
 *
 * This abstract class stores common information and behavior
 * for all turtle artist classes.
 */
public abstract class TurtleArtist {
    private final String artistName;
    private final Turtle turtle;

    /**
     * Creates a TurtleArtist with a name and a new Turtle object.
     *
     * @param artistName the name of the turtle artist
     */
    public TurtleArtist(String artistName) {
        this.artistName = artistName;
        this.turtle = new Turtle();
    }

    /**
     * Creates a TurtleArtist with a name and an existing Turtle object.
     *
     * @param artistName the name of the turtle artist
     * @param turtle the Turtle object being used
     */
    public TurtleArtist(String artistName, Turtle turtle) {
        this.artistName = artistName;
        this.turtle = turtle;
    }

    /**
     * Returns the name of the artist.
     *
     * @return the artist name
     */
    public String getName() {
        return artistName;
    }

    /**
     * Returns the Turtle object.
     *
     * @return the turtle object
     */
    public Turtle getTurtle() {
        return turtle;
    }

    /**
     * Moves the turtle to a specific position.
     *
     * @param x the x position
     * @param y the y position
     */
    public void moveTo(int x, int y) {
        turtle.setPosition(x, y);
    }

    /**
     * Changes the turtle's fill color.
     *
     * @param color the color name
     */
    public void setColor(String color) {
        turtle.fillColor(color);
    }

    /**
     * Points the turtle to the right.
     */
    public void faceRight() {
        turtle.setDirection(0);
    }

    /**
     * Draws a shape using the turtle.
     * Each child class must define its own drawing.
     */
    public abstract void draw();
}