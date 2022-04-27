package abstractexam;

public class FigureTest {
    public static void main(String[] args) {

        // Figure figure = new Figure(1, 3); // 만들 수 없다.
        Triangle triangle = new Triangle(1, 3, 2, 2);
        triangle.drawing();

        Square square = new Square(5, 5, 10, 10);
        square.drawing();

        Circle circle = new Circle(7, 7, 20);
        circle.drawing();

        circle.initialization();
        circle.drawing();
    }
}
