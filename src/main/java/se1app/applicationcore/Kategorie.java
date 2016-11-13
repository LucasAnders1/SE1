package se1app.applicationcore;

import java.awt.Color;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Kategorie {
	
	@GeneratedValue
	@Id
	private int id;
	
	private String name;
	
	private Color farbe;

}
