package no.hvl.dat100.oppgave2;

import no.hvl.dat100.common.TODO;

public class Bilde extends Tekst {

    
    private String url;

    // uten likes 
    public Bilde(int id, String bruker, String dato, String tekst, String url) {
        super(id, bruker, dato, tekst);
        this.url = url;
    }

    // med likes
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
    	
    	//litt rar løsning for å arve toString fra Tekst og få riktig utskrift i testen
    	return "BILDE\n" + super.toString().replace("TEKST\n", "") + url + "\n";
    	
    	//denne lagde feil i testeren til blogg.java
    	
        //return "BILDE\n" + super.toString() + url + "\n";
    }
    
    public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}

}
