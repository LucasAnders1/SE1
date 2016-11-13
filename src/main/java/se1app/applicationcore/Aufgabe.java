package se1app.applicationcore;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Aufgabe {

	@GeneratedValue
	@Id
	private int id;
	
	private String name;
	
	private String beschreibung;
	
	private int prioritaet;
	
//	private TimestampTyp erstelldatum;
	
//	private DatumTyp termin;
	
	@ElementCollection
	private List<Benutzer> erledigtVon;
	
	@ManyToOne
	@JoinColumn(name="kategorie_id")
	private Kategorie kategorie;
}
