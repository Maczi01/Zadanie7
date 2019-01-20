public class Main {

    public static void main(String[] args) {

        Triangle triangle = new Triangle(13,5,12);
        Calculations c = new Calculations();

        System.out.println(c.isRightTriangle(triangle));
        System.out.println(c.isRightTriangleEgyptianMethod(triangle));

    }
}
