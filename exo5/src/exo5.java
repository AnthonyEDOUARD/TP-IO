import java.io.*;
import java.util.Scanner;

public class exo5 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);// Mise en place du scanner
        System.out.println("tapez le nom du fichier a copier");
        try (FileReader aLire = new FileReader(sc.nextLine()); // fichier à lire
            //System.out.println("tapez le nom du fichier ou l'on copie");
             FileWriter aEcrire = new FileWriter(sc.nextLine())) { /*fichier à écrire*/
            int c = aLire.read();
            while(c!=-1) {
                aEcrire.write(c);
                c = aLire.read();
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
