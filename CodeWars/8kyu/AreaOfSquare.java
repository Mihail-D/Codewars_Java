public class AreaOfSquare {
    public static double squareArea(double A){
        double circleLength = A * 4;
        double radius = circleLength / (2 * Math.PI);
        double squareArea = (4 * Math.pow(radius, 2)) / 4;

        return Math.round(squareArea * 100.0) / 100.0;
    }

    public static void main(String[] args) {
            System.out.println(squareArea(2)); //80
        }
}
