/**
 * Author: @francescobrillante
 * Lab 8 Turtle Artist Project
 *
 * This class draws a circle using the Turtle class.
 */
public class CircleArtist extends TurtleArtist {
    private final int steps;

    /**
     * Creates a CircleArtist with a name and number of steps.
     *
     * @param artistName the name of the circle artist
     * @param steps the number of steps used to draw the circle
     */
    public CircleArtist(String artistName, int steps) {
        super(artistName);
        this.steps = steps;
    }

    /**
     * Creates a CircleArtist with a name, Turtle object, and number of steps.
     *
     * @param artistName the name of the circle artist
     * @param turtle the Turtle object being used
     * @param steps the number of steps used to draw the circle
     */
    public CircleArtist(String artistName, Turtle turtle, int steps) {
        super(artistName, turtle);
        this.steps = steps;
    }

    /**
     * Returns the number of steps used for the circle.
     *
     * @return the number of steps
     */
    public int getSteps() {
        return steps;
    }

    /**
     * Draws a circle using the turtle.
     */
    @Override
    public void draw() {
        getTurtle().shape("turtle");
        getTurtle().fillColor("green");
        getTurtle().outlineColor("black");

        for (int step = 0; step < steps; step++) {
            getTurtle().forward(5);
            getTurtle().left(360.0 / steps);
        }
    }

    /**
     * Returns a String version of the CircleArtist object.
     *
     * @return object information as a String
     */
    @Override
    public String toString() {
        return "CircleArtist{name='" + getName() + "', steps=" + steps + "}";
    }

    /**
     * Checks if two CircleArtist objects are equal.
     *
     * @param object the object being compared
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (!(object instanceof CircleArtist)) {
            return false;
        }

        CircleArtist otherCircle = (CircleArtist) object;
        return getName().equals(otherCircle.getName())
                && steps == otherCircle.steps;
    }
}