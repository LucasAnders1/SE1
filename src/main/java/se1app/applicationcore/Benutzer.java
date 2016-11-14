package se1app.applicationcore;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.dom4j.io.ElementModifier;
import org.hibernate.annotations.ManyToAny;

import se1app.applicationcore.util.EmailType;

@Entity
public class Benutzer {

	public Benutzer(int id, String nickname, String vorname, String nachname, String passwort, EmailType email,
			List<ToDoListe> hatListen, List<ToDoListe> istMitglied, List<ToDoListe> istAdmin) {
		this.id = id;
		this.nickname = nickname;
		this.vorname = vorname;
		this.nachname = nachname;
		this.passwort = passwort;
		this.email = email;
		this.hatListen = hatListen;
		this.istMitglied = istMitglied;
		this.istAdmin = istAdmin;
	}

	@GeneratedValue
	@Id
	private int id;
	
	private String nickname;
	
	private String vorname;
	
	private String nachname;
	
	private String passwort;
	
	private EmailType email;
	
	@ManyToMany
	@JoinTable(name = "benutzer_hatListen", joinColumns={@JoinColumn(name="benutzer_id")}, inverseJoinColumns={@JoinColumn(name="todoliste_id")})
	private List<ToDoListe> hatListen;
	
	@ManyToMany
	@JoinTable(name = "benutzer_istMitglied", joinColumns={@JoinColumn(name="benutzer_id")}, inverseJoinColumns={@JoinColumn(name="gruppe_id")})
	private List<ToDoListe> istMitglied;
	
	@ManyToMany
	@JoinTable(name = "benutzer_istAdmin", joinColumns={@JoinColumn(name="benutzer_id")}, inverseJoinColumns={@JoinColumn(name="gruppe_id")})
	private List<ToDoListe> istAdmin;
}
