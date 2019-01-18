public class Main {

    public static void main(String[] args) {

        Triangle triangle = new Triangle(13,5,12);
        Calculations c = new Calculations(triangle);

        System.out.println( c.isRightTriangle(triangle));

    }
}
