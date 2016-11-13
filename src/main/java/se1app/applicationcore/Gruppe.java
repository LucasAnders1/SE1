package se1app.applicationcore;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Gruppe {

	@GeneratedValue
	@Id
	private int id;
	
	private String name;
	
//	@ElementCollection
//	private List<Benutzer> admins;
//	
//	@ElementCollection
//	private List<Benutzer> mitglieder;
	
	@ManyToMany
	@JoinTable(name = "gruppe_hatListen", joinColumns={@JoinColumn(name="gruppe_id")}, inverseJoinColumns={@JoinColumn(name="todolisten_id")})
	private List<ToDoListe> hatListen;
	
}
