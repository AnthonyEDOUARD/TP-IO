import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.Scanner;

public class exo6 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("veuillez taper l'url de l'image");
        String imageUrl = sc.nextLine(); //
        String destinationFile = "image.jpg";

        saveImage(imageUrl, destinationFile);
    }

    public static void saveImage(String imageUrl, String destinationFile) throws IOException {
        URL url = new URL(imageUrl); //la variable URL est instanciée
        InputStream is = url.openStream();
        OutputStream os = new FileOutputStream(destinationFile);// la destination de la réécriture de l'image est faite ici

        byte[] b = new byte[2048]; // les bytes sont stockés dans un tableau de 2048 places
        int length;

        while ((length = is.read(b)) != -1) { /* La boucle permettant la lecture et l'écriture de l'image est faite ici*/
            os.write(b, 0, length);
        }

        is.close();
        os.close();
    }

}
