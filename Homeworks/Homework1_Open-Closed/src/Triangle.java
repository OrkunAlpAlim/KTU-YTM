public class Triangle implements Area, Circumference {
    private double base;
    private double h;

    public Triangle(double base, double h) {
        this.base = base;
        this.h = h;
    }

    @Override
    public double calculateArea() {
        return (base * h) / 2;
    }

    @Override
    public double calculateCircumference() {
        return base + (2 * Math.sqrt(Math.pow(h, 2) + Math.pow(base / 2, 2)));
    }
}