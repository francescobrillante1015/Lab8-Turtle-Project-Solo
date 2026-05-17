public class SquareArtist extends TurtleArtist {
    private final int sideLength;

    public SquareArtist(String name, int sideLength) {
        super(name);
        this.sideLength = sideLength;
    }

    public SquareArtist(String name, Turtle turtle, int sideLength) {
        super(name, turtle);
        this.sideLength = sideLength;
    }

    public int getSideLength() {
        return sideLength;
    }

    @Override
    public void draw() {
        getTurtle().shape("square");
        getTurtle().fillColor("blue");
        getTurtle().outlineColor("black");

        for (int i = 0; i < 4; i++) {
            getTurtle().forward(sideLength);
            getTurtle().left(90);
        }
    }

    @Override
    public String toString() {
        return "SquareArtist{name='" + getName() + "', sideLength=" + sideLength + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof SquareArtist)) {
            return false;
        }

        SquareArtist other = (SquareArtist) obj;
        return getName().equals(other.getName()) && sideLength == other.sideLength;
    }
}