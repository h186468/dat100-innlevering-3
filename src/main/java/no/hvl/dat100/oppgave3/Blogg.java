package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;
import no.hvl.dat100.oppgave2.*;

public class Blogg {

	private Innlegg[] innleggtabell;
	private int nesteledig;

	public Blogg(Innlegg[] innlegg, int nesteledig) {

		this.innleggtabell = innlegg;
		this.nesteledig = nesteledig;

	}

	public Blogg(int lengde) {

		this.innleggtabell = new Innlegg[lengde];
		this.nesteledig = 0;

	}

	public Blogg() {
		this.innleggtabell = new Innlegg[20];
		this.nesteledig = 0;
	}

	public int getAntall() {

		return nesteledig;

	}

	public Innlegg[] getSamling() {

		return innleggtabell;

	}

	public int finnInnlegg(Innlegg innlegg) {

		for (int i = 0; i < nesteledig; i++) {
			if (innleggtabell[i].erLik(innlegg)) {
				return i;
			}
		}

		return -1;

	}

	public boolean finnes(Innlegg innlegg) {

		if (finnInnlegg(innlegg) >= 0) {
			return true;
		} else {
			return false;
		}

	}

	public boolean ledigPlass() {

		return nesteledig < innleggtabell.length;

	}

	public boolean leggTil(Innlegg innlegg) {

		if (ledigPlass() && !finnes(innlegg)) {
			innleggtabell[nesteledig] = innlegg;
			nesteledig++;
			return true;
		} else {
			return false;
		}

	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(nesteledig).append("\n");
		for (int i = 0; i < nesteledig; i++) {
			sb.append(innleggtabell[i].toString());
		}
		return sb.toString();

	}
	

	// valgfrie oppgaver nedenfor

	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}

	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());

	}

	public boolean slett(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
	}

	public int[] search(String keyword) {

		throw new UnsupportedOperationException(TODO.method());

	}
}