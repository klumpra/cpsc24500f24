import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number between 0 and 360: ");
        double num = sc.nextDouble();
        if (num < 0) {
            System.out.println("You need to enter a positive number or 0.");
        } else if (num > 360) {
            System.out.println("You need to enter a positive number less than 360.");
        } else {
            double squareRootOfNumber, logOfNumber, cosOfNumber, sinOfNumber;
            squareRootOfNumber = Math.sqrt(num);
            logOfNumber = Math.log(num);
            double inRadians = num/180*Math.PI;
            cosOfNumber = Math.cos(inRadians);
            sinOfNumber = Math.sin(inRadians);
            /* tabulate the results - show the label of the value in 25 characters, 
            and then show the value in 10 characters with three after decimal 
            Square Root             127.342
            Log                       0.478
            Cosine                    0.483
            Sine                     -0.123 */
            System.out.printf("%-25s%10.3f\n","Square Root",squareRootOfNumber);
            System.out.printf("%-25s%10.3f\n","Log",logOfNumber);
            System.out.printf("%-25s%10.3f\n","Cosine",cosOfNumber);
            System.out.printf("%-25s%10.3f\n","Sine",sinOfNumber);
        }
    }
}
