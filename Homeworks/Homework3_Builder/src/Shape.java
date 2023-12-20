class Shape {
    private int sides;
    private String startPosition;
    private int edgeLength;
    private int edgeWidth;
    private String edgeColor;
    private String insideColor;

    private Shape(int sides, String startPosition, int edgeLength, int edgeWidth, String edgeColor,
            String insideColor) {
        this.sides = sides;
        this.startPosition = startPosition;
        this.edgeLength = edgeLength;
        this.edgeWidth = edgeWidth;
        this.edgeColor = edgeColor;
        this.insideColor = insideColor;
    }

    static class ShapeBuilder {
        private int sides;
        private String startPosition;
        private int edgeLength;
        private int edgeWidth;
        private String edgeColor;
        private String fillColor;

        public ShapeBuilder sides(int sides) {
            this.sides = sides;
            return this;
        }

        public ShapeBuilder startPosition(String startPosition) {
            this.startPosition = startPosition;
            return this;
        }

        public ShapeBuilder edgeLength(int edgeLength) {
            this.edgeLength = edgeLength;
            return this;
        }

        public ShapeBuilder edgeWidth(int edgeWidth) {
            this.edgeWidth = edgeWidth;
            return this;
        }

        public ShapeBuilder edgeColor(String edgeColor) {
            this.edgeColor = edgeColor;
            return this;
        }

        public ShapeBuilder fillColor(String fillColor) {
            this.fillColor = fillColor;
            return this;
        }

        public Shape build() {
            return new Shape(sides, startPosition, edgeLength, edgeWidth, edgeColor, fillColor);
        }
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public String getStartPosition() {
        return startPosition;
    }

    public void setStartPosition(String startPosition) {
        this.startPosition = startPosition;
    }

    public int getEdgeLength() {
        return edgeLength;
    }

    public void setEdgeLength(int edgeLength) {
        this.edgeLength = edgeLength;
    }

    public int getEdgeWidth() {
        return edgeWidth;
    }

    public void setEdgeWidth(int edgeWidth) {
        this.edgeWidth = edgeWidth;
    }

    public String getEdgeColor() {
        return edgeColor;
    }

    public void setEdgeColor(String edgeColor) {
        this.edgeColor = edgeColor;
    }

    public String getInsideColor() {
        return insideColor;
    }

    public void setInsideColor(String insideColor) {
        this.insideColor = insideColor;
    }
}