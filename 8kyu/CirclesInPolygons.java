public class CirclesInPolygons {
    private double diameter;
    int sides;
    int sideLength;

    public void Polygon(int sides, int sideLength) {
        this.diameter = sideLength / Math.tan(Math.toRadians(180d/sides));
    }
    public CirclesInPolygons(double diameter) {
        this.diameter = diameter;
    }

    public double circleDiameter(){
        return this.diameter;
    }
}
