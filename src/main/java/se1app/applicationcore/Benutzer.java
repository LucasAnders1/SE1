package se1app.applicationcore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.dom4j.io.ElementModifier;

import se1app.applicationcore.util.EmailType;

@Entity
public class Benutzer {

	@GeneratedValue
	@Id
	private int id;
	
	private String nickname;
	
	private String vorname;
	
	private String nachname;
	
	private String passwort;
	
	private EmailType email;
}
