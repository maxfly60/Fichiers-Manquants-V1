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
public class choix_date {
    
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
     
    
    public static String choix_annee() {
        java.util.Scanner entreeClavier = new java.util.Scanner(System.in);
        String annee;
        
        System.out.println("Merci de rentrer l'annee (format AA): ");
        annee = entreeClavier.next();
        
        return annee;
    }
    
    public static String choix_mois() {
        java.util.Scanner entreeClavier = new java.util.Scanner(System.in);
        String mois;
        
        System.out.println("Merci de rentrer le mois (format MM): ");
        mois = entreeClavier.next();
        
        check = liste_chiffre.contains(mois);
 
        if(check != true){
             return mois;
             
        } else {
            
            mois = "0" + mois;
            return mois;
        }
    }
        
    public static String choix_jour() {
        java.util.Scanner entreeClavier = new java.util.Scanner(System.in);
        String jour;
        
        System.out.println("Merci de rentrer le jour (format JJ): ");
        jour = entreeClavier.next();
        
        check = liste_chiffre.contains(jour);
 
        if(check != true){
             return jour;
             
        } else {
            
            jour = "0" + jour;
            return jour;
        }
    }
        
    public static String choix_heure() {
        java.util.Scanner entreeClavier = new java.util.Scanner(System.in);
        String heure;
        
        System.out.println("Merci de rentrer l'heure (format HH): ");
        heure = entreeClavier.next();

        check = liste_chiffre.contains(heure);
 
        if(check != true){
             return heure;
             
        } else {
            
            heure = "0" + heure;
            return heure;
        }
    }
}
