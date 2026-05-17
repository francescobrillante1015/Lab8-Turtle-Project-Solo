public abstract class TurtleArtist {
    private final String artistName;
    private final Turtle turtle;

    public TurtleArtist(String artistName) {
        this.artistName = artistName;
        this.turtle = new Turtle();
    }

    public TurtleArtist(String artistName, Turtle turtle) {
        this.artistName = artistName;
        this.turtle = turtle;
    }

    public String getName() {
        return artistName;
    }

    public Turtle getTurtle() {
        return turtle;
    }

    public void moveTo(int x, int y) {
        turtle.setPosition(x, y);
    }

    public void setColor(String color) {
        turtle.fillColor(color);
    }

    public void faceRight() {
        turtle.setDirection(0);
    }

    public abstract void draw();
}