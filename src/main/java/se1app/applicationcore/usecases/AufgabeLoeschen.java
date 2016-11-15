package se1app.applicationcore.usecases;

import org.springframework.beans.factory.annotation.Autowired;

import se1app.applicationcore.Aufgabe;
import se1app.applicationcore.repos.AufgabeRepo;

/**
 * @author lucas_anders
 *
 */
public interface AufgabeLoeschen {
	
	/** zu loeschende AUfgabe finden
	 * @param name
	 * @return
	 */
	Aufgabe findAufgabeByName(String name);
	
	/**  Aufgabe im Repo loeschen
	 * @param aufgabe
	 */
	void loescheAufgabe(Aufgabe aufgabe);

}
