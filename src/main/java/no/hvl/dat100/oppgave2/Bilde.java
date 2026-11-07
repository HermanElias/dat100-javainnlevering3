package no.hvl.dat100.oppgave2;

import no.hvl.dat100.common.TODO;

public class Bilde extends Tekst {

	private String url;
	
	public Bilde(int id, String bruker, String dato, String tekst, String url) {
		super(id, bruker, dato, tekst);
		this.url = url;
	}

	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
		super(id, bruker, dato, likes, tekst);
		this.url = url;
	}
	
	public String getUrl() {
		return url;

	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "BILDE\n" + super.toString().substring("TEKST\n".length()) + url + "\n";

	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
    return "<h2>" + getBruker() + "@" + getDato() + " [" + getLikes() + "]<h2>\n" + "<p>" + getTekst() + "<p>\n" + "<iframe src=\"" + getUrl() + "\" height=600 width=800></iframe><hr>\n";
	}
}
