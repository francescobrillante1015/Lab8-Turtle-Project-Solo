import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Turtle Artist Program!");
        System.out.println("Choose what you want to draw:");
        System.out.println("1. Square");
        System.out.println("2. Circle");
        System.out.println("3. Both");
        System.out.print("Enter your choice: ");

        int choice = input.nextInt();

        if (choice == 1) {
            System.out.print("Enter the side length for the square: ");
            int sideLength = input.nextInt();

            SquareArtist square = new SquareArtist("Square Turtle", sideLength);
            square.moveTo(100, 100);
            square.faceRight();

            System.out.println(square);
            square.draw();

        } else if (choice == 2) {
            System.out.print("Enter how many steps for the circle: ");
            int steps = input.nextInt();

            if (steps <= 0) {
                System.out.println("Steps must be greater than 0.");
            } else {
                CircleArtist circle = new CircleArtist("Circle Turtle", steps);
                circle.moveTo(300, 300);
                circle.faceRight();

                System.out.println(circle);
                circle.draw();
            }

        } else if (choice == 3) {
            SquareArtist square = new SquareArtist("Square Turtle", 100);
            CircleArtist circle = new CircleArtist("Circle Turtle", 72);

            square.moveTo(100, 100);
            square.faceRight();

            circle.moveTo(300, 300);
            circle.faceRight();

            System.out.println(square);
            System.out.println(circle);

            square.draw();
            circle.draw();

        } else {
            System.out.println("Invalid choice.");
        }

        Turtle.zoomFit();
        input.close();
    }
}