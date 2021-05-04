/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nombre_de_fichier.COMPTER;

import java.util.*;
import nombre_de_fichier.CHOIX.*;
import nombre_de_fichier.verif1Fichier.verif1FichierCreerListe;

/**
 *
 * @author Max
 */
public class compter_mois {
    public static void compter_mois() {
        
        String chemin = "C:\\Users\\Max\\Desktop\\CSV";
        
        System.out.println("Vous avez choisi de vérifier le nombre de fichier sur un mois.\n");
        int fichiers_theorique;
        
        String annee = choix_date.choix_annee();
        String mois = choix_date.choix_mois();
        
        fichiers_theorique = fichiers_theorique(annee, mois);
        
        
        List<String> liste_annee = verif1FichierCreerListe.filtre_annee(chemin, annee);
        List<String> liste_mois = verif1FichierCreerListe.filtre_mois(chemin, mois);
        
        List<String> liste_finale = liste_1_mois(liste_annee, liste_mois);
        //System.out.println(liste_finale);
        
        int nombre_fichier_reel = comparaison(liste_finale, fichiers_theorique);
        
        System.out.println("Il y'a " + nombre_fichier_reel + " fichiers sur " + fichiers_theorique);
        
        
        
        
        
    }
    
    
    public static int fichiers_theorique(String annee, String mois) {
        int nombre_heure_theorique = 0;
        
        if (mois.equals("01") || mois.equals("03") || mois.equals("05") || mois.equals("07")
                || mois.equals("08") || mois.equals("10") || mois.equals("12")) {
            // Mois à 31 jours.
            nombre_heure_theorique = 744;
        } else {
            if (mois.equals("04") || mois.equals("06") || mois.equals("09") || mois.equals("11")) {
               // Mois à 31 jours.
                nombre_heure_theorique = 720; 
            } else {
                if (mois.equals("02") && 
                            (annee.equals("20") || annee.equals("24") || annee.equals("28") || annee.equals("32")) ) {
                    nombre_heure_theorique = 696; 
                } else {
                   
                    nombre_heure_theorique = 672; 
                    
                }
            }
        }
        System.out.println("Pour le mois " + mois + ", nombre de fichiers théoriques : " + nombre_heure_theorique);
        
        return nombre_heure_theorique;
    }
    
    public static List liste_1_mois(List liste_annee, List liste_mois){
        
        List<String> liste_finale_1_mois;
        
        liste_finale_1_mois = new ArrayList<String>(liste_annee);        // Liste année
        liste_finale_1_mois.retainAll(liste_mois);                       // Liste année + mois
        
        return liste_finale_1_mois;
    }
    
    public static int comparaison(List liste, int fichiers_theoriques){
        int nombre_fichier_reel;
        
       nombre_fichier_reel = liste.size();
       
       if (nombre_fichier_reel != fichiers_theoriques) {
           System.out.println("Il manque des fichiers.");
       } else {
           System.out.println("Tous les fichiers sont présents.");
       }
       
       return nombre_fichier_reel; 
    }
}
