public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getPerimetr(){
        return a+b+c;
    }

    public double getArea(){
        double pp = getPerimetr()/2; // Формула герона
        return Math.sqrt(pp*(pp-a)*(pp-b)*(pp-c));
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
}
