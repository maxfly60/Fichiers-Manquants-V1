/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nombre_de_fichier.CHOIX;

import java.util.*;

/**
 *
 * @author Max
 */
public class choix_date_fin {
    
    static List<String> liste_chiffre = new ArrayList<String>(){
        {
            add("1");
            add("2");
            add("3");
            add("4");
            add("5");
            add("6");
            add("7");
            add("8");   
            add("9");  
        }
    };
    
    static boolean check;
     
    
    public static String choix_annee_fin() {
        java.util.Scanner entreeClavier = new java.util.Scanner(System.in);
        String annee_fin;
        
        System.out.println("Merci de rentrer l'annee de fin (format AA): ");
        annee_fin = entreeClavier.next();
        
        return annee_fin;
    }
    
    public static String choix_mois_fin() {
        java.util.Scanner entreeClavier = new java.util.Scanner(System.in);
        String mois_fin;
        
        System.out.println("Merci de rentrer le mois de fin (format MM): ");
        mois_fin = entreeClavier.next();
        
        check = liste_chiffre.contains(mois_fin);
 
        if(check != true){
             return mois_fin;
             
        } else {
            
            mois_fin = "0" + mois_fin;
            return mois_fin;
        }
    }
        
    public static String choix_jour_fin() {
        java.util.Scanner entreeClavier = new java.util.Scanner(System.in);
        String jour_fin;
        
        System.out.println("Merci de rentrer le jour de fin (format JJ): ");
        jour_fin = entreeClavier.next();
        
        check = liste_chiffre.contains(jour_fin);
 
        if(check != true){
             return jour_fin;
             
        } else {
            
            jour_fin = "0" + jour_fin;
            return jour_fin;
        }
    }
        
    public static String choix_heure_fin() {
        java.util.Scanner entreeClavier = new java.util.Scanner(System.in);
        String heure_fin;
        
        System.out.println("Merci de rentrer l'heure de fin (format HH): ");
        heure_fin = entreeClavier.next();

        check = liste_chiffre.contains(heure_fin);
 
        if(check != true){
             return heure_fin;
             
        } else {
            
            heure_fin = "0" + heure_fin;
            return heure_fin;
        }
    }
}