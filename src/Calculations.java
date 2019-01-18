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

}
