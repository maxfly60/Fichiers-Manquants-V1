/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nombre_de_fichier.COMPTER;

import java.util.ArrayList;
import java.util.List;
import nombre_de_fichier.CHOIX.*;
import nombre_de_fichier.config;
import nombre_de_fichier.verif1Fichier.verif1FichierCreerListe;

/**
 *
 * @author Max
 */
public class compter_jour {
    
    static String chemin = config.chemin;

        public static void compter_jour() {
            
        
        
        
        System.out.println("Vous avez choisi de vérifier le nombre de fichier sur un jour.\n");
        int fichiers_theorique = 24;
        
        String annee = choix_date.choix_annee();
        String mois = choix_date.choix_mois();
        String jour = choix_date.choix_jour();
        
        
        
        List<String> liste_annee = verif1FichierCreerListe.filtre_annee(chemin, annee);
        List<String> liste_mois = verif1FichierCreerListe.filtre_mois(chemin, mois);
        List<String> liste_jour = verif1FichierCreerListe.filtre_jour(chemin, jour);
        
        List<String> liste_fichiers_presents = liste_1_jour(liste_annee, liste_mois, liste_jour);
        
        int nombre_fichier_reel = comparaison_nombre_fichier(liste_fichiers_presents, fichiers_theorique, jour, mois, annee);
        
        
        
        List<String> liste_theorique = creer_liste_theorique(annee, mois, jour);
        
        List<String> liste_fichiers_manquants = creer_liste_manquant(liste_fichiers_presents, liste_theorique);
        
        if (liste_fichiers_manquants.isEmpty()) {
            System.exit(0);
        }else {       
            System.out.println("Il manque le(s) fichier(s) suivant : \n" + liste_fichiers_manquants);
        }
        
        
    }

    
    public static List liste_1_jour(List liste_annee, List liste_mois, List liste_jour){
        
        List<String> liste_1_mois, liste_finale_1_jour;
        
        liste_1_mois = new ArrayList<String>(liste_annee);        // Liste année
        liste_1_mois.retainAll(liste_mois);                       // Liste année + mois
        
        liste_finale_1_jour = new ArrayList<String>(liste_jour);         // Liste jour
        liste_finale_1_jour.retainAll(liste_1_mois);                           // Liste année + mois + jours

        
        return liste_finale_1_jour;
    }
    
    public static int comparaison_nombre_fichier(List liste, int fichiers_theoriques, String jour, String mois, String annee){
        int nombre_fichier_reel;
        
       nombre_fichier_reel = liste.size();
       
       if (nombre_fichier_reel != fichiers_theoriques) {
           System.out.println("Pour le " + jour + "/" + mois + "/" + annee + ", il y'a " 
                   + nombre_fichier_reel + " fichiers sur " + fichiers_theoriques);
       } else {
           System.out.println("Pour le " + jour + "/" + mois + "/" + annee + ", tous les fichiers sont présents. " 
                   + nombre_fichier_reel + " fichiers sur " + fichiers_theoriques);
       }
       
       return nombre_fichier_reel; 
    }

    public static List creer_liste_theorique(String annee, String mois, String jour) {
        
        List<String> liste_theorique = new ArrayList<String>(){
            {
            add(annee + mois + jour + "00.CSV");
            add(annee + mois + jour + "01.CSV");
            add(annee + mois + jour + "02.CSV");
            add(annee + mois + jour + "03.CSV");
            add(annee + mois + jour + "04.CSV");
            add(annee + mois + jour + "05.CSV");
            add(annee + mois + jour + "06.CSV");
            add(annee + mois + jour + "07.CSV");
            add(annee + mois + jour + "08.CSV");
            add(annee + mois + jour + "09.CSV");
            add(annee + mois + jour + "10.CSV");
            add(annee + mois + jour + "11.CSV");
            add(annee + mois + jour + "12.CSV");
            add(annee + mois + jour + "13.CSV");
            add(annee + mois + jour + "14.CSV");
            add(annee + mois + jour + "15.CSV");
            add(annee + mois + jour + "16.CSV");
            add(annee + mois + jour + "17.CSV");
            add(annee + mois + jour + "18.CSV");
            add(annee + mois + jour + "19.CSV");
            add(annee + mois + jour + "20.CSV");
            add(annee + mois + jour + "21.CSV");
            add(annee + mois + jour + "22.CSV");
            add(annee + mois + jour + "23.CSV");
            }
        };
        
        return liste_theorique;
    }
    
    public static List creer_liste_manquant(List liste_fichiers_presents, List liste_theorique) {
        List<String> liste_fichiers_manquants;

        liste_fichiers_manquants= new ArrayList<String>(liste_theorique);

        liste_fichiers_manquants.removeAll(liste_fichiers_presents);
        
        return liste_fichiers_manquants;
    }

}

