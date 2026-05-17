public abstract class TurtleArtist {
    private final String name;
    private final Turtle turtle;

    public TurtleArtist(String name) {
        this.name = name;
        this.turtle = new Turtle();
    }

    public TurtleArtist(String name, Turtle turtle) {
        this.name = name;
        this.turtle = turtle;
    }

    public String getName() {
        return name;
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