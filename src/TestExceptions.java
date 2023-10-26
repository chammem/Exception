import java.io.*;


public class TestExceptions {
    public static void main(String[] args) {
        try {
            // Ouverture du fichier d'entrée
            File inputFile = new File("Sample.jpg");
            FileInputStream in1 = new FileInputStream(inputFile);
            // Ouverture du fichier de sortie
            File outputFile1 = new File("Output1.jpg");
            FileOutputStream out1 = new FileOutputStream(outputFile1);
            int c1;
            // Copie du contenu du fichier d'entrée vers le fichier de sortie
            while ((c1 = in1.read()) != -1) {
                out1.write(c1);
            }
            // Fermeture des fichiers
            in1.close();
            out1.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Une erreur s'est produite lors de la copie du fichier.");
        }
    }
}