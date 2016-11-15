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

	/** gibt alle Listen des Benutzers an
	 * @param benutzer
	 * @return
	 */
	List<ToDoListe> findListsByBenutzer(Benutzer benutzer);
	
	/** gibt alle Aufgaben der ausgewählten Liste zurück
	 * @param liste
	 * @return
	 */
	List<Aufgabe> findAufgabenByList(ToDoListe liste);

	/**  speichert die Aufgabe im Repo
	 * @param aufgabeDTO
	 */
	void saveAufgabe(AufgabeDTO aufgabeDTO);

}
