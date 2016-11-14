package se1app.applicationcore;

import java.util.ArrayList;
import java.util.List;

import se1app.applicationcore.util.DatumTyp;
import se1app.applicationcore.util.TimestampTyp;

public class AufgabeDTO {

	public AufgabeDTO(int id, String name, String beschreibung, int prioritaet, 
			TimestampTyp erstelldatum, DatumTyp termin, 
			List<Benutzer> erledigtVon, Kategorie kategorie) {
		this.id = id;
		this.name = name;
		this.beschreibung = beschreibung;
		this.prioritaet = prioritaet;
		this.erstelldatum = erstelldatum;
		this.termin = termin;
		this.erledigtVon = erledigtVon;
		this.kategorie = kategorie;
	}

	private int id;
	
	private String name;
	
	private String beschreibung;
	
	private int prioritaet;
	
	private TimestampTyp erstelldatum;
	
	private DatumTyp termin;
	
	private List<Benutzer> erledigtVon;

	private Kategorie kategorie;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getBeschreibung() {
		return beschreibung;
	}

	public int getPrioritaet() {
		return prioritaet;
	}

	public TimestampTyp getErstelldatum() {
		return new TimestampTyp(erstelldatum);
	}

	public DatumTyp getTermin() {
		return new DatumTyp(termin);
	}

	public List<Benutzer> getErledigtVon() {
		return new ArrayList<Benutzer>(erledigtVon);
	}

	public Kategorie getKategorie() {
		return new Kategorie(kategorie);
	}
	
}

