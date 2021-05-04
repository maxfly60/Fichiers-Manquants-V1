/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nombre_de_fichier.verif1Fichier;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Max
 */
public class verif1FichierRegroupement {

    static List<String> liste_vide = new ArrayList<String>() {
        {
        }
    };

    public static List regroupement_list(List liste_annee, List liste_mois, List liste_jour, List liste_heure) {
        
        List<String> liste_finale;
        List<String> liste1;
        List<String> liste2;
        liste1 = new ArrayList<String>(liste_annee); // Liste année
        liste1.retainAll(liste_mois); // Liste année + mois
        liste2 = new ArrayList<String>(liste_jour); // Liste jour
        liste2.retainAll(liste1); // Liste année + mois + jours
        liste_finale = new ArrayList<String>(liste_heure); // Liste heure
        liste_finale.retainAll(liste2); // Liste finale
        if (liste_finale.isEmpty()) {
            return liste_vide;
        } else {
            return liste_finale;
        }
    }
    
}
