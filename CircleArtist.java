public class CircleArtist extends TurtleArtist {
    private final int steps;

    public CircleArtist(String artistName, int steps) {
        super(artistName);
        this.steps = steps;
    }

    public CircleArtist(String artistName, Turtle turtle, int steps) {
        super(artistName, turtle);
        this.steps = steps;
    }

    public int getSteps() {
        return steps;
    }

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

    @Override
    public String toString() {
        return "CircleArtist{name='" + getName() + "', steps=" + steps + "}";
    }

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