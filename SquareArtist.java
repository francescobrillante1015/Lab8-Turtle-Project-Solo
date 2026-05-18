/**
 * Author: @francescobrillante
 * Lab 8 Turtle Artist Project
 *
 * This class draws a square using the Turtle class.
 */
public class SquareArtist extends TurtleArtist {
    private final int sideLength;

    /**
     * Creates a SquareArtist with a name and side length.
     *
     * @param artistName the name of the square artist
     * @param sideLength the length of each side
     */
    public SquareArtist(String artistName, int sideLength) {
        super(artistName);
        this.sideLength = sideLength;
    }

    /**
     * Creates a SquareArtist with a name, Turtle object, and side length.
     *
     * @param artistName the name of the square artist
     * @param turtle the Turtle object being used
     * @param sideLength the length of each side
     */
    public SquareArtist(String artistName, Turtle turtle, int sideLength) {
        super(artistName, turtle);
        this.sideLength = sideLength;
    }

    /**
     * Returns the side length of the square.
     *
     * @return the side length
     */
    public int getSideLength() {
        return sideLength;
    }

    /**
     * Draws a square using the turtle.
     */
    @Override
    public void draw() {
        getTurtle().shape("turtle");
        getTurtle().fillColor("green");
        getTurtle().outlineColor("black");

        for (int side = 0; side < 4; side++) {
            getTurtle().forward(sideLength);
            getTurtle().left(90);
        }
    }

    /**
     * Returns a String version of the SquareArtist object.
     *
     * @return object information as a String
     */
    @Override
    public String toString() {
        return "SquareArtist{name='" + getName() + "', sideLength=" + sideLength + "}";
    }

    /**
     * Checks if two SquareArtist objects are equal.
     *
     * @param object the object being compared
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (!(object instanceof SquareArtist)) {
            return false;
        }

        SquareArtist otherSquare = (SquareArtist) object;
        return getName().equals(otherSquare.getName())
                && sideLength == otherSquare.sideLength;
    }
}