package no.hvl.dat100.oppgave1;

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
		likes++; 
	}
	
	 // f) Sammenligner id
	public boolean erLik(Innlegg innlegg) {
		return innlegg != null && this.id == innlegg.getId();

	}
	
	 // e) Returnerer innlegget som tekst
	@Override
	public String toString() {
		
		return id + "\n" + bruker + "\n" + dato + "\n" + likes + "\n";
				
	}
	
	// Oppgave 6
	public String toHTML() {
		
		 return "<h2>" + getBruker() + "@" + getDato()
            + " [" + getLikes() + "]</h2>\n";
				
	}
}
