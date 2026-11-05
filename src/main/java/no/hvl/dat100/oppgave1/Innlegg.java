package no.hvl.dat100.oppgave1;

import no.hvl.dat100.common.TODO;

public abstract class Innlegg {
	
	 // a) Objektvariabler
    private int id;
    private String bruker;
    private String dato;
    private int likes;

	
	public Innlegg() {
		
	}
	
	 // b) Konstruktør med 3 parametre
	public Innlegg(int id, String bruker, String dato) {

		this.id = id;
        this.bruker = bruker;
        this.dato = dato;
        this.likes = 0;
		
	}
     // b) Konstruktør med 4 parametre
	public Innlegg(int id, String bruker, String dato, int likes) {

		 this.id = id;
        this.bruker = bruker;
        this.dato = dato;
        this.likes = likes;
	}
	
	 // c) Get- og set-metoder
	public String getBruker() {
		return bruker;

	}

	public void setBruker(String bruker) {
		 this.bruker = bruker;
	}

	public String getDato() {
		 return dato;
		
	}

	public void setDato(String dato) {
		 this.dato = dato;
	}

	public int getId() {
		return id;

	}

	public int getLikes() {
		return likes;
		
	}
	
	 // d) Øker antall likes med 1
	public void doLike () {
		
	}
	
	public boolean erLik(Innlegg innlegg) {
		throw new UnsupportedOperationException(TODO.method());

	}
	
	@Override
	public String toString() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
