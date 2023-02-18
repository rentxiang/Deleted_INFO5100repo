public class Main2 {
    public static void main(String[] args) {
        System.out.println("---------------------------");
        Shape shape = new Circle(2.0);
        System.out.println("Area of the circle: " + shape.calculateArea());
        System.out.println("Perimeter of the circle: " + shape.calculatePerimeter());

        System.out.println("---------------------------");
        shape = new Rectangle(3.0, 4.0);
        System.out.println("Area of the rectangle: " + shape.calculateArea());
        System.out.println("Perimeter of the rectangle: " + shape.calculatePerimeter());

        System.out.println("---------------------------");
        shape = new Triangle(5.0, 6.0, 3.0, 4.0, 5.0);
        System.out.println("Area of the triangle: " + shape.calculateArea());
        System.out.println("Perimeter of the triangle: " + shape.calculatePerimeter());

        System.out.println("---------------------------");
        shape = new Square(4.0);
        System.out.println("Area of the square: " + shape.calculateArea());
        System.out.println("Perimeter of the square: " + shape.calculatePerimeter());
        System.out.println("---------------------------");

    }
}




