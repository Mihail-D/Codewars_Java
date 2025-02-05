public class MlsPerGallon_KmPerLiter {
    private static final float LITER = 4.54609188f;
    private static final float KILOMETER = 1.609344f;

    public static float mpgToKPM(final float mpg) {
        return Float.parseFloat(String.format("%.2f", mpg * KILOMETER / LITER ));
    }
    
    public static void main(String[] args) {
            System.out.println(mpgToKPM(30 ));
        }
}

// 1 Imperial Gallon = 4.54609188 litres
// 1 Mile = 1.609344 kilometres

