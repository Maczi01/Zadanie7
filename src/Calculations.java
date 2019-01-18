public class Calculations {

    Triangle triangle;

    public Calculations(Triangle triangle) {
        this.triangle = triangle;
    }

    public boolean isRightTriangle(Triangle t) {
        if ((t.getA() * t.getA() + t.getB() * t.getB() == t.getC() * t.getC()) ||
                (t.getA() * t.getA() + t.getC() * t.getC() == t.getB() * t.getB()) ||
                (t.getC() * t.getC() + t.getB() * t.getB() == t.getA() * t.getA())) {
            return true;
        }
        return false;

    }

    public boolean isRightTriangleEgyptianMethod(Triangle t) {
        if ((t.getA() % 3 == 0 || t.getB() % 3 == 0 || t.getC() % 3 == 0) &&
                (t.getA() % 4 == 0 || t.getB() % 4 == 0 || t.getC() % 4 == 0) &&
                (t.getA() % 5 == 0 || t.getB() % 5 == 0 || t.getC() % 5 == 0)) {
            return true;
        }
        return false;
    }
}