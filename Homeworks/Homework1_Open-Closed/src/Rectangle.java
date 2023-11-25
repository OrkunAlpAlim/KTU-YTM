public class Rectangle implements Area, Circumference {
    private double width;
    private double lenght;

    public Rectangle(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;
    }

    @Override
    public double calculateArea() {
        return width * lenght;
    }

    @Override
    public double calculateCircumference() {
        return 2 * (width + lenght);
    }
}