public class Square implements Area, Circumference {
    private double edge;

    public Square(double edge) {
        this.edge = edge;
    }

    @Override
    public double calculateArea() {
        return edge * edge;
    }

    @Override
    public double calculateCircumference() {
        return 4 * edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }
}