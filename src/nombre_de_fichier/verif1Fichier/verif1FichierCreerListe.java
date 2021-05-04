/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nombre_de_fichier.verif1Fichier;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Max
 */
public class verif1FichierCreerListe {

    public static List filtre_jour(String chemin, String jour) {
        // Creates an array in which we will store the names of files and directories
        String[] liste;
        // Creates a new File instance by converting the given pathname string
        // into an abstract pathname
        File dossier = new File(chemin);
        FilenameFilter filter_jour = new FilenameFilter() {
            @Override
            public boolean accept(File dossier, String name) {
                return name.regionMatches(4, jour, 0, 2);
            }
        };
        liste = dossier.list(filter_jour);
        List<String> liste_jour = new ArrayList<String>(Arrays.asList(liste));
        return liste_jour;
    }

    public static List filtre_heure(String chemin, String heure) {
        // Creates an array in which we will store the names of files and directories
        String[] liste;
        // Creates a new File instance by converting the given pathname string
        // into an abstract pathname
        File dossier = new File(chemin);
        FilenameFilter filter_heure = new FilenameFilter() {
            @Override
            public boolean accept(File dossier, String name) {
                return name.regionMatches(6, heure, 0, 2);
            }
        };
        liste = dossier.list(filter_heure);
        List<String> liste_heures = new ArrayList<String>(Arrays.asList(liste));
        return liste_heures;
    }

    public static List filtre_annee(String chemin, String annee) {
        // Creates an array in which we will store the names of files and directories
        String[] liste;
        // Creates a new File instance by converting the given pathname string
        // into an abstract pathname
        File dossier = new File(chemin);
        FilenameFilter filter_annee = new FilenameFilter() {
            @Override
            public boolean accept(File dossier, String name) {
                return name.regionMatches(0, annee, 0, 2);
            }
        };
        liste = dossier.list(filter_annee);
        List<String> liste_annees = new ArrayList<String>(Arrays.asList(liste));
        return liste_annees;
    }

    public static List filtre_mois(String chemin, String mois) {
        // Creates an array in which we will store the names of files and directories
        String[] liste;
        // Creates a new File instance by converting the given pathname string
        // into an abstract pathname
        File dossier = new File(chemin);
        FilenameFilter filter_mois = new FilenameFilter() {
            @Override
            public boolean accept(File dossier, String name) {
                return name.regionMatches(2, mois, 0, 2);
            }
        };
        liste = dossier.list(filter_mois);
        List<String> liste_mois = new ArrayList<String>(Arrays.asList(liste));
        return liste_mois;
    }
    
}
