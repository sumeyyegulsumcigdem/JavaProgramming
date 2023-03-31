package day39_Recap.shapeTask;

public class ShapeObject {

    public static void main(String[] args) {

        Square square = new Square(10);

        System.out.println(square.getName());

        System.out.println("---------------------");

        Rectangle rectangle = new Rectangle(10, 5);

        System.out.println(rectangle);

        rectangle.setLength(12);

        System.out.println(rectangle.getLength());

        System.out.println(rectangle.getName());

        System.out.println("---------------------");

        Circle circle = new Circle(4.5);

        System.out.println(circle);

        circle.setRadius(15.2);

        System.out.println(circle.getRadius());

        System.out.println(circle);

        System.out.println(circle.getName());
    }

}
