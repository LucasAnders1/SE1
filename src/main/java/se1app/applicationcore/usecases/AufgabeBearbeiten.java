package se1app.applicationcore.usecases;

import se1app.applicationcore.Aufgabe;

public interface AufgabeBearbeiten {
	
	/**speichert die Änderungen an einer Aufgabe im Repo
	 * @param aufgabe
	 */
	public void aktualisiereAufgabe(int id);

}
