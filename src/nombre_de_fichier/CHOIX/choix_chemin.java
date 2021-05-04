/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nombre_de_fichier.CHOIX;

import java.io.File;

/**
 *
 * @author Max
 */
public class choix_chemin {
    
    // OBLIGER DE RENTRER LE CHEMIN DEUX FOIS POUR QUE CA MARCHE
    public static String choix_chemin() {
        java.util.Scanner entreeClavier = new java.util.Scanner(System.in);
        String chemin;
    
        System.out.println("Merci de rentrer le chemin vers vos fichiers: ");
        chemin = entreeClavier.next();

        // VERIFICATION CHEMIN VALIDE
        File dossier = new File(chemin);
  
        do {
            dossier = new File(chemin);
    
            System.out.println("Le dossier n'existe pas, "
                    + "merci de rentrer le chemin vers vos fichiers.");
            chemin = entreeClavier.next();
            //dossier = new File(chemin);
        } while (!dossier.exists() && !dossier.isDirectory());
        
        System.out.println("Le dossier existe.");
        return chemin;
    }
    
}
    
    
    

