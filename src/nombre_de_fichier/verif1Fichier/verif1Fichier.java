/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nombre_de_fichier.verif1Fichier;

import java.util.*;
import nombre_de_fichier.CHOIX.*;
import nombre_de_fichier.config;

/**
 *
 * @author Max
 */
public class verif1Fichier {
    static String chemin = config.chemin;
    public static void verif1Fichier() {
        
        
        
        System.out.println("Vous avez choisi de vérifier la présence d'un seul fichier.\n");
        
        String annee = choix_date.choix_annee();
        System.out.println("Annee début: 20" + annee + "\n");
        
        String mois = choix_date.choix_mois();
        System.out.println("Mois début: " + mois + "\n");
        
        String jour = choix_date.choix_jour();
        System.out.println("Jour début: " + jour + "\n");
        
        String heure = choix_date.choix_heure();
        System.out.println("Heure début: " + heure + "\n");
        
        List<String> liste_annee = verif1FichierCreerListe.filtre_annee(chemin, annee);
        List<String> liste_mois = verif1FichierCreerListe.filtre_mois(chemin, mois);
        List<String> liste_jour = verif1FichierCreerListe.filtre_jour(chemin, jour);
        List<String> liste_heure = verif1FichierCreerListe.filtre_heure(chemin, heure);
        
        List<String> liste_finale = verif1FichierRegroupement.regroupement_list(liste_annee, liste_mois, liste_jour, liste_heure);
        
        if (liste_finale.isEmpty()){
            System.out.println("Le fichier correspondant au " + jour + "/" + mois + "/20" 
                    + annee + " à " + heure + " n'a pas été trouvé.");
        } else {
            System.out.println(liste_finale);
            System.out.println("Le fichier correspondant au " + jour + "/" + mois + "/20" 
                    + annee + " à " + heure + " heures existe bien.");
        }
    }
}
