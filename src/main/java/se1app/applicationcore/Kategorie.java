package se1app.applicationcore;

import java.awt.Color;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Kategorie {
	
	public Kategorie(Kategorie kategorie) {
		this.id = kategorie.id;
		this.name = kategorie.name;
		this.farbe = kategorie.farbe;
	}
	
	public Kategorie(int id, String name, Color farbe) {
		this.id = id;
		this.name = name;
		this.farbe = farbe;
	}

	@GeneratedValue
	@Id
	private int id;
	
	private String name;
	
	private Color farbe;

}
