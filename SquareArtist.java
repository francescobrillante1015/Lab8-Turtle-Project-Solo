public class SquareArtist extends TurtleArtist {
    private final int sideLength;

    public SquareArtist(String artistName, int sideLength) {
        super(artistName);
        this.sideLength = sideLength;
    }

    public SquareArtist(String artistName, Turtle turtle, int sideLength) {
        super(artistName, turtle);
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

        for (int side = 0; side < 4; side++) {
            getTurtle().forward(sideLength);
            getTurtle().left(90);
        }
    }

    @Override
    public String toString() {
        return "SquareArtist{name='" + getName() + "', sideLength=" + sideLength + "}";
    }

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