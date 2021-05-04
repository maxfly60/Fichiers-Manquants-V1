/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nombre_de_fichier;

import nombre_de_fichier.verif1Fichier.verif1Fichier;
import java.util.List;
import javax.swing.text.View;
import nombre_de_fichier.COMPTER.*;
import nombre_de_fichier.verifMoisDernierEtDebutMois.*;
/**
 *
 * @author Max
 */
public class Nombre_de_fichier {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        java.util.Scanner entreeClavier = new java.util.Scanner(System.in);
        
        System.out.println("Bonjour, merci de choisir ce que vous voulez faire :\n");
        System.out.println("1. Vérifier la présence d'un fichier.");
        System.out.println("2. Verifier le nombre de fichiers sur le mois dernier ainsi que depuis le début du mois.");
        System.out.println("3. Comparer le nombre de fichier réel et théorique (sur un jour).\n");
        
        
        String choix = entreeClavier.next();
        
        
        switch (choix) {
            
            case "1" :
                System.out.println("__________________ \n");
                verif1Fichier.verif1Fichier();
                break;
                
            case "2" :
                System.out.println("__________________ \n");
                verifMoisDernier.verifMoisDernier();
                System.out.println("\n__________________ \n");
                verifDebutMois.verifDebutMois();
                break;
                
            case "3" :
                System.out.println("__________________ \n");
                compter_jour.compter_jour();
                break;

        }
        
        
        
        
    }


}
    



