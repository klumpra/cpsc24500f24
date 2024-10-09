import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;

/**
 * This program asks the user for the name of a text file to read.
 * It then reads a line at a time and capitalizes those lines,
 * writing them to the output file.
 */
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the file to read: ");
        String inputFileName = sc.nextLine();
        System.out.print("Enter the name of the file to write: ");
        String outputFileName = sc.nextLine();
        String line;
        try {
            Scanner fsc = new Scanner(new File(inputFileName));
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File(outputFileName))));
            while (fsc.hasNextLine()) {
                line = fsc.nextLine();
                line = line.toUpperCase();
                System.out.println(line);
                pw.println(line);
            }
            fsc.close();
            pw.close();
        } catch (Exception ex) {
            System.out.println("You're out of luck. Something happened reading from the file.");
        }
    }
}
