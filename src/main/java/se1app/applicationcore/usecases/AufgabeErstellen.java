package se1app.applicationcore.usecases;

import java.util.List;
import se1app.applicationcore.Aufgabe;
import se1app.applicationcore.AufgabeDTO;
import se1app.applicationcore.Benutzer;
import se1app.applicationcore.ToDoListe;

/**
 * @author Lucas Anders, Lydia Pflug
 * @date 14.11.2016
 * Interface fuer UseCase Aufgabe erstellen.
 *
 */
public interface AufgabeErstellen {

	List<ToDoListe> findListsByBenutzer(Benutzer benutzer);
	
	List<Aufgabe> findAufgabenByList(ToDoListe liste);

	void saveAufgabe(AufgabeDTO aufgabeDTO);

}
