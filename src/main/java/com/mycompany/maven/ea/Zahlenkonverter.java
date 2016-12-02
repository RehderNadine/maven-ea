/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.maven.ea;

import java.util.Scanner;


/**
 *
 * @author Nadine
 */
public class Zahlenkonverter 
{
     private static Scanner scanner = new Scanner(System.in);
    private static RoemischDezimal[] roemischDezimalArray = {
        new RoemischDezimal("M",1000),
        new RoemischDezimal("CM",900),
        new RoemischDezimal("D", 500),
        new RoemischDezimal("CD", 400),
        new RoemischDezimal("C", 100),
        new RoemischDezimal("XC", 90),
        new RoemischDezimal("L", 50),
        new RoemischDezimal("XL", 40),
        new RoemischDezimal("X", 10),
        new RoemischDezimal("IX", 9),
        new RoemischDezimal("V", 5),
        new RoemischDezimal("IV", 4),
        new RoemischDezimal("I", 1)
    };
    
    public static void main(String argv[]) {
            auswahlEntgegennehmen();
    }
 
    /**
     * Methode zum Umrechnen einer Dezimalzahl in eine römische Zahl
     * @param dezimalZahl
     * @return 
     */
    public static String getRoemischeZahl(int dezimalZahl) {
	String roemischeZahl = "";
		
	for(int i = 0; i < roemischDezimalArray.length; i++) {
            while (dezimalZahl >= roemischDezimalArray[i].getDezimal()) {
                dezimalZahl -= roemischDezimalArray[i].getDezimal();
		roemischeZahl += roemischDezimalArray[i].getRoemisch();
            }
	}
	return roemischeZahl;
        
    }
    /**
     * Methode zum Umrechnen einer römischen Zahl in eine Dezimalzahl
     * @param roemischeZahl
     * @return 
     */
    public static int getDezimalZahl(String roemischeZahl) {
        int dezimalZahl = 0;
       
        for (int i = 0; i < roemischDezimalArray.length; i++) {
            while (roemischeZahl.indexOf(roemischDezimalArray[i].getRoemisch()) == 0) {
                dezimalZahl += roemischDezimalArray[i].getDezimal();
                roemischeZahl = roemischeZahl.replaceFirst(roemischDezimalArray[i].getRoemisch(), "");
            }
        }
        return dezimalZahl;
    }
    /**
     * Methode zum Entgegennehmen der Auswahl
     */
    public static void auswahlEntgegennehmen() {
        System.out.println("Wählen Sie die 1, um eine Dezimalzahl umzuwandeln oder die 2, um eine römische Zahl umzuwandeln!");
        System.out.print("Eingabe: ");
        String eingabe = scanner.nextLine();
        auswahlVerarbeiten(eingabe);
           
    }
    /**
     * Methode zum Weiterverarbeiten der Auswahl
     * 1: Dezimalzahl in Römische Zahl
     * 2: römische Zahl in Dezimalzahl
     * @param eingabe 
     */
    public static void auswahlVerarbeiten(String eingabe) {
       if ("1".equals(eingabe)){
            System.out.print("Bitte geben Sie die Dezimalzahl ein: ");
            int dezimalZahl = scanner.nextInt();
             System.out.println("römische Zahl: "+getRoemischeZahl(dezimalZahl));
        }
            
        else if ("2".equals(eingabe)){
            System.out.print("Bitte geben Sie die römische Zahl ein: ");
            String roemischeZahl = scanner.nextLine().toUpperCase();
            System.out.println("Dezimalzahl: " +getDezimalZahl(roemischeZahl));
            
        }
    }
}
