package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;
import no.hvl.dat100.oppgave2.Tekst;

public class Blogg {

	private Innlegg[] innleggtabell;
	private int nesteledig;

	public Blogg() {
		innleggtabell = new Innlegg[20];
		nesteledig = 0;
	}

	public Blogg(int lengde) {
		innleggtabell = new Innlegg[lengde];
		nesteledig = 0; 
	}

	public int getAntall() {
		return nesteledig;
	}
	
	public Innlegg[] getSamling() {
		return innleggtabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {

		for (int i = 0; i < nesteledig; i++){
			if (innleggtabell[i].erLik(innlegg)) {
				return i;
			}

		}
		return -1; 
	}

	public boolean finnes(Innlegg innlegg) {
		return finnInnlegg(innlegg) != -1;
	}

	public boolean ledigPlass() {
		return nesteledig < innleggtabell.length;

	}
	
	public boolean leggTil(Innlegg innlegg) {
		if (finnes(innlegg)){
			return false;
		}
		if (!ledigPlass()) {
			return false;
		}
		innleggtabell[nesteledig] = innlegg;
		nesteledig++;
		return true;
	}
	
	public String toString() {
		String resultat = nesteledig + "\n";
		for (int i = 0; i < nesteledig; i ++) {
			resultat += innleggtabell[i].toString();
		}
		return resultat;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		Innlegg[] nyTabell = new Innlegg[innleggtabell.length * 2];
		for (int i = 0; i < nesteledig; i++){
			nyTabell[i] = innleggtabell[i];
		}
		innleggtabell = nyTabell;

	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		if (finnes(innlegg)) {
			return false;
		}
		if (!ledigPlass()){
			utvid();
		}
		innleggtabell[nesteledig] = innlegg;
		nesteledig++;
		return true;

		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		int indeks = finnInnlegg(innlegg);

		if (indeks == -1) {
			return false;
		}
		for (int i = indeks; i < nesteledig - 1; i++){
			innleggtabell[i] = innleggtabell[i + 1];
		}
		nesteledig--;
		innleggtabell[nesteledig] = null;
		return true; 

	}
	
	public int[] search(String keyword) {
		int[] nyTabell = new int[nesteledig];
		int antall = 0;
		for (int i = 0; i < nesteledig; i++) {
			if (innleggtabell[i] instanceof Tekst){
				String tekst = ((Tekst) innleggtabell[i]).getTekst();
				if (tekst.contains(keyword)){
					
					nyTabell[antall] = innleggtabell[i].getId();
					antall++;
				}

			}
		}
		int[] resultat = new int[antall];
		for (int i = 0; i < antall; i++) {
    	resultat[i] = nyTabell[i];
		}
		return resultat;
	}
}