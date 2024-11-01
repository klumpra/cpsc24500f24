import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedHashMap;
public class App {
    public static void printPasswords(ArrayList<String> pwds) {
        for (String pwd : pwds) {
            System.out.println(pwd);
        }
    }
    public static void main(String[] args) throws Exception {
        System.out.print("Enter filename that contains tokens: ");
        Scanner sc = new Scanner(System.in);
        String fname = sc.nextLine();
        LinkedHashMap<String,ArrayList<String>> tokens = TokenReader.readTokensFromFile(fname);
//        TokenWriter.writeTokensToScreen(tokens);
        PasswordGenerator pg = new PasswordGenerator(tokens);
        int howMany, symLikely, numLikely;
        ArrayList<String> passwords;  // what the pg generates for me
        do {
            System.out.print("How many passwords should I generate? ");
            howMany = sc.nextInt();
            if (howMany > 0) {
                System.out.print("How likely should each password contain a symbol (0-10)? ");
                symLikely = sc.nextInt();
                System.out.print("How likely should each password contain a number (0-10)? ");
                numLikely = sc.nextInt();    
                pg.setSymbolChance(symLikely);
                pg.setNumberChance(numLikely); 
                passwords = pg.generatePasswords(howMany);
                System.out.println("Here are the passwords: ");
                printPasswords(passwords);
                System.out.println();                                          
            }
        } while (howMany > 0);
    }
}