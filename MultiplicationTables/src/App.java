/**
 * Prints multiplication tables 1 through 12
 * @author CPSC 24500 class
 */
public class App {
    public static void main(String[] args) throws Exception {
        int prod;
        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 12; j++) {
                prod = i * j;
                System.out.printf("%2d * %2d = %3d\n",i,j,prod);
            }
            System.out.println();
        }
    }
}
