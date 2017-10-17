package fr.edouard.exo1;
import java.util.Scanner;
import java.io.*;



public class exo1 {
    public static void main(String[] args){

    class cheminAcces {

        public String cheminAppele() {
            // Récupération du chemin d'accés
            System.out.println(" Ecrivez le chemin: ");
            return new Scanner(System.in).nextLine();
        }


        public void cheminATester(String chemin) {
            String message = " ";
            File cheminTest = new File(chemin);
            if (cheminTest.exists()) { // existe
                if (cheminTest.isFile()) { // est un fichier
                    message = " Le fichier existe ";
                } else if (cheminTest.isDirectory()) {   // est un dossier
                    message = " Le dossier existe ";
                }
            } else {    // n'existe pas
                message = " Le chemin n'existe pas ";
            }
            System.out.println(message);
        }
    }
}
}
