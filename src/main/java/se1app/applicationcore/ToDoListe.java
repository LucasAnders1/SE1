package se1app.applicationcore;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ToDoListe {

	@GeneratedValue
	@Id
	private int id;
	
	private String name;
	
	@ElementCollection
	@Column(name = "aufgaben")
	private List<Aufgabe> aufgaben;
}
