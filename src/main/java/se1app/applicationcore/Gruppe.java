package se1app.applicationcore;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Gruppe {

	@GeneratedValue
	@Id
	private int id;
	
	private String name;
	
	@ElementCollection
	private List<Benutzer> admins;
	
	@ElementCollection
	private List<Benutzer> mitglieder;
	
}
