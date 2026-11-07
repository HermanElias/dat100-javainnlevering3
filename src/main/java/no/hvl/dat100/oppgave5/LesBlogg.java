package no.hvl.dat100.oppgave5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;
import no.hvl.dat100.oppgave2.*;
import no.hvl.dat100.oppgave3.*;

import javax.swing.JOptionPane;

public class LesBlogg {

	private static String TEKST = "TEKST";
	private static String BILDE = "BILDE";

	public static Blogg les(String mappe, String filnavn) {
    try (BufferedReader leser =
            new BufferedReader(new FileReader(mappe + filnavn))) {

        	int antall = Integer.parseInt(leser.readLine());
       		Blogg blogg = new Blogg(antall);

        	for (int i = 0; i < antall; i++) {
            String type = leser.readLine();
            int id = Integer.parseInt(leser.readLine());
            String forfatter = leser.readLine();
            String dato = leser.readLine();
            int liker = Integer.parseInt(leser.readLine());
            String tekst = leser.readLine();

            	if (TEKST.equals(type)) {
                blogg.leggTil(new Tekst(id, forfatter, dato, liker, tekst));
            	} else if (BILDE.equals(type)) {
                String url = leser.readLine();
                blogg.leggTil(new Bilde(id, forfatter, dato, liker, tekst, url));
            	}
        	}

        	return blogg;
    	} 
		catch (IOException e) {
        return null;
    	}
	}
} 