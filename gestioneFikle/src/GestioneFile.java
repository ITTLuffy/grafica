import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GestioneFile {

    public static void main(String[] args) {

        //        try {
//            // istanza file
//            File nuovoFile = new File("C:\\esempio\\nuovo.txt");
//            // creo file
//            // createNewFile() --> ritorna true se il file viene creato
//            if(nuovoFile.createNewFile()) {
//                System.out.println("File creato: " + nuovoFile.getName());
//            } else {
//                System.out.println("File esiste già");
//            }
//        } catch (IOException ex) {
//            System.out.println("Attenzione, qualcosa non è andato a buon fine");
//            System.out.println(ex.getMessage());
//        }
//        try {
//            InputStreamReader input = new InputStreamReader(System.in);
//
//            BufferedReader tastiera = new BufferedReader(input);
//
//            System.out.println("Inserisci il tuo nome: ");
//            String nome = tastiera.readLine();
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }

//        try {
//            InputStreamReader input = new InputStreamReader(System.in);
//            BufferedReader tastiera = new BufferedReader(input); 
//            
//            System.out.println("Inserisci primo numero: ");
//            int n1 = Integer.parseInt(tastiera.readLine());
//            System.out.println("Inserisci secondo numero: ");
//            int n2 = Integer.parseInt(tastiera.readLine());
//            System.out.println(n1+n2);
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        } catch (NumberFormatException nfe) {
//            System.out.println(nfe.getMessage());
//        }
        try {
            File f = new File("C:\\esempio\\nuovo.txt");
            Scanner in = new Scanner(f);
            while(in.hasNextLine()) {
                String s = in.nextLine();
                System.out.println(s);
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    
    
    }
    

}
