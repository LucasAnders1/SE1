package se1app.applicationcore;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class ToDoListe {

	@GeneratedValue
	@Id
	private int id;
	
	private String name;
	
	@ManyToMany
	@JoinTable(name = "liste_hatAufgaben", joinColumns={@JoinColumn(name="todoliste_id")}, inverseJoinColumns={@JoinColumn(name="aufgabe_id")})
	private List<Aufgabe> hatAufgaben;
	
	
}
