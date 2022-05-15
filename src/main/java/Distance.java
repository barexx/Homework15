public class Distance {
    private static double distance;

    public static void print() {
        System.out.println(distance + " m");
        Distance.Converter.toCM();
        Distance.Converter.toKM();
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
    }

    public static void setDistance(double distance) {
        Distance.distance = distance;
    }
}
