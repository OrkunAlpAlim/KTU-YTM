public class App {
  public static void main(String[] args) {
    Shape shape = new Shape.ShapeBuilder()
        .sides(4)
        .startPosition("Top left corner")
        .edgeLength(50)
        .edgeWidth(5)
        .edgeColor("Black")
        .fillColor("Red")
        .build();
    System.out.println("Created Shape; \nSides = " + shape.getSides() +
        "\nStart Position = " + shape.getStartPosition() +
        "\nEdge Length = " + shape.getEdgeLength() +
        "\nEdge Width = " + shape.getEdgeWidth() +
        "\nEdge Color = " + shape.getEdgeColor() +
        "\nFill Color = " + shape.getInsideColor());
  }
}
