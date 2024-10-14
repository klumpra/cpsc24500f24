import java.util.Scanner;
import java.io.File;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Scanner fsc = null;
        while (fsc == null) {
            System.out.print("Enter the name of the file of grades: ");
            String fname = sc.nextLine();
            try {
                fsc = new Scanner(new File(fname));
            } catch (Exception ex) {
                System.out.println("That file could not be opened. Try again.");
            }
        }
        String line;
        String[] parts;
        String name;
        double total,avg;
        while (fsc.hasNextLine()) {
            line = fsc.nextLine().trim();  // read the line; take away leading and trailing white space
            if (line.length() > 0) {   // if the line is not empty
                parts = line.split("\t");
                name = parts[0];
                total = 0;
                for (int i = 1; i < parts.length; i++) {
                    total = total + Integer.parseInt(parts[i]);
                }
                avg = total / (parts.length - 1);
                System.out.printf("%-12s%5.2f\n",name,avg);
            }
        }
        fsc.close();
    }
}
