import java.util.Scanner;

/**
 * This program converts between celsius and fahrenheit temperature scales.
 */
public class App {

    /**
     * Prints a glorious heading more beautiful than Iceland.
     */
    public static void printHeading() {
        System.out.println("*************************************************");
        System.out.println("            Temperature Converter V1.0");
        System.out.println("*************************************************");
        System.out.println();
    }
    /**
     * Converts a fahrenheit temperature to celsius
     * @param temp in degrees farhenehit
     * @return the converted temperature in degrees celsius
     */
    public static double convertToCelsius(double temp) {
        double result = 5.0/9*(temp-32);
        return result;
    }
    /**
     * Converts a celsius temperature to fahrenheit
     * @param temp in degrees celsius
     * @return the converted temperature in degrees fahrenheit
     */
    public static double convertToFahrenheit(double temp) {
        double result = 9.0/5*temp + 32;
        return result;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        printHeading();
        System.out.print("Please enter the temperature and the scale (F or C): ");
        double ogTemp;
        String scale;
        ogTemp = sc.nextDouble();
        scale = sc.next();
        double newTemp;
        if (scale.equalsIgnoreCase("F")) {
            newTemp = convertToCelsius(ogTemp);
            System.out.printf("The new temp is %.2f degrees %s.\n",newTemp,"C");
        } else if (scale.equalsIgnoreCase("C")) {
            newTemp = convertToFahrenheit(ogTemp);
            System.out.printf("The new temp is %.2f degrees %s.\n",newTemp,"F");
        } else {
            System.out.println("You need to follow directions. Only F and C are allowed.");
        }
    }
}
