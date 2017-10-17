import java.io.File;
import java.util.Scanner;

public class exo2 {

    public static void main(String[] args) {
        //

        Scanner sc = new Scanner(System.in);
        System.out.println("Saisissez votre répertoire :");
        File f = new File(sc.nextLine());
        // permet à l'utilisateur de saisir un répertoire
        String[] ListeFichiers;
        //On créé un tableau pour les fichiers présents dans le repertoire
        ListeFichiers = f.list();
        int i;


        for (i = 0; i < ListeFichiers.length; i++) {
            System.out.println("Fichiers du répertoire : " + ListeFichiers[i]);

        }

        // Cette méthode nous permet de lister les fichiers dans le répertoire saisie par l'utilisateur
        //On affiche les fichiers présent dans le répertoire
        System.out.println("Nombre de fichiers du répertoire : " + i);


        System.out.println("Répertoire: " + f.getAbsoluteFile());


    }
}




