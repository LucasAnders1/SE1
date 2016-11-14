package se1app.applicationcore;

import java.util.List;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import se1app.applicationcore.util.DatumTyp;
import se1app.applicationcore.util.TimestampTyp;

@Entity
public class Aufgabe {

	public Aufgabe(AufgabeDTO aufgabeDTO) {
		this.id = aufgabeDTO.getId();
		this.name = aufgabeDTO.getName();
		this.beschreibung = aufgabeDTO.getBeschreibung();
		this.prioritaet = aufgabeDTO.getPrioritaet();
		this.erstelldatum = aufgabeDTO.getErstelldatum();
		this.termin = aufgabeDTO.getTermin();
		this.erledigtVon = aufgabeDTO.getErledigtVon();
		this.kategorie = aufgabeDTO.getKategorie();
		
	}

	@GeneratedValue
	@Id
	private int id;
	
	private String name;
	
	private String beschreibung;
	
	private int prioritaet;
	
	private TimestampTyp erstelldatum;
	
	private DatumTyp termin;
	
	@ElementCollection
	private List<Benutzer> erledigtVon;
	
	@ManyToOne
	@JoinColumn(name="kategorie_id")
	private Kategorie kategorie;
}
