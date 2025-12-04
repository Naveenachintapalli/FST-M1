package Activities;

public class Activity3 {

    static final double EARTH_YEAR_SECONDS = 31557600;

    public static void main(String[] args) {

        long ageInSeconds = 1_000_000_000L;

        System.out.println("Age in seconds: " + ageInSeconds);

        System.out.printf("Age on Earth: %.2f years\n", ageOnPlanet(ageInSeconds, 1));
        System.out.printf("Age on Mercury: %.2f years\n", ageOnPlanet(ageInSeconds, 0.2408467));
        System.out.printf("Age on Venus: %.2f years\n", ageOnPlanet(ageInSeconds, 0.61519726));
        System.out.printf("Age on Mars: %.2f years\n", ageOnPlanet(ageInSeconds, 1.8808158));
        System.out.printf("Age on Jupiter: %.2f years\n", ageOnPlanet(ageInSeconds, 11.862615));
        System.out.printf("Age on Saturn: %.2f years\n", ageOnPlanet(ageInSeconds, 29.447498));
        System.out.printf("Age on Uranus: %.2f years\n", ageOnPlanet(ageInSeconds, 84.016846));
        System.out.printf("Age on Neptune: %.2f years\n", ageOnPlanet(ageInSeconds, 164.79132));
    }


    public static double ageOnPlanet(long seconds, double orbitalPeriodInEarthYears) {
        return seconds / (EARTH_YEAR_SECONDS * orbitalPeriodInEarthYears);
    }
}
