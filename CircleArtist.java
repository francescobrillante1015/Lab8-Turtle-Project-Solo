public class CircleArtist extends TurtleArtist {
    private final int steps;

    public CircleArtist(String name, int steps) {
        super(name);
        this.steps = steps;
    }

    public CircleArtist(String name, Turtle turtle, int steps) {
        super(name, turtle);
        this.steps = steps;
    }

    public int getSteps() {
        return steps;
    }

    @Override
    public void draw() {
        getTurtle().shape("circle");
        getTurtle().fillColor("red");
        getTurtle().outlineColor("black");

        for (int i = 0; i < steps; i++) {
            getTurtle().forward(5);
            getTurtle().left(360.0 / steps);
        }
    }

    @Override
    public String toString() {
        return "CircleArtist{name='" + getName() + "', steps=" + steps + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof CircleArtist)) {
            return false;
        }

        CircleArtist other = (CircleArtist) obj;
        return getName().equals(other.getName()) && steps == other.steps;
    }
}