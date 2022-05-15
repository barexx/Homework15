public class Distance {
    private static double distance;

    public static void print() {
        System.out.println(distance + " m");
        Distance.Converter.toCM();
        Distance.Converter.toKM();
        Distance.Converter.toMiles();
    }

    static class Converter {
        static void toCM() {
            double distanceToCM = distance * 100;
            System.out.println(distanceToCM + " cm");
        }

        static void toKM() {
            double distanceToKM = distance / 1000;
            System.out.println(distanceToKM + " km");
        }

        static void toMiles() {
            double distanceToMiles = distance / 1609;
            System.out.println(distanceToMiles + " miles");
        }
    }

    public static void setDistance(double distance) {
        Distance.distance = distance;
    }
}
