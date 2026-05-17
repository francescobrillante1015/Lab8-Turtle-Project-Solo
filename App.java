import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int choice = 0;

        while (choice != 4) {
            System.out.println("Welcome to the Turtle Artist Program!");
            System.out.println("Choose what you want to draw:");
            System.out.println("1. Square");
            System.out.println("2. Circle");
            System.out.println("3. Both");
            System.out.println("4. Quit");
            System.out.print("Enter your choice: ");

            choice = keyboard.nextInt();

            if (choice == 1) {
                System.out.print("Enter the side length for the square: ");
                int sideLength = keyboard.nextInt();

                SquareArtist squareArtist = new SquareArtist("Square Turtle", sideLength);
                squareArtist.moveTo(100, 100);
                squareArtist.faceRight();

                System.out.println(squareArtist);
                squareArtist.draw();

            } else if (choice == 2) {
                System.out.print("Enter how many steps for the circle: ");
                int steps = keyboard.nextInt();

                if (steps <= 0) {
                    System.out.println("Steps must be greater than 0.");
                } else {
                    CircleArtist circleArtist = new CircleArtist("Circle Turtle", steps);
                    circleArtist.moveTo(300, 300);
                    circleArtist.faceRight();

                    System.out.println(circleArtist);
                    circleArtist.draw();
                }

            } else if (choice == 3) {
                SquareArtist squareArtist = new SquareArtist("Square Turtle", 100);
                CircleArtist circleArtist = new CircleArtist("Circle Turtle", 72);

                squareArtist.moveTo(100, 100);
                squareArtist.faceRight();

                circleArtist.moveTo(300, 300);
                circleArtist.faceRight();

                System.out.println(squareArtist);
                System.out.println(circleArtist);

                squareArtist.draw();
                circleArtist.draw();

            } else if (choice == 4) {
                System.out.println("Goodbye!");

            } else {
                System.out.println("Invalid choice.");
            }

            Turtle.zoomFit();
            System.out.println();
        }

        keyboard.close();
    }
}