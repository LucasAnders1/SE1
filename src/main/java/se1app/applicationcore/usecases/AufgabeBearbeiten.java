package se1app.applicationcore.usecases;

import se1app.applicationcore.Aufgabe;

public interface AufgabeBearbeiten {
	
	/**Liefert die zu aendernde Aufgabe
	 * @param name
	 * @return
	 */
	Aufgabe findAufgabeByName(String name);
	
	/**speichert die Änderungen an einer Aufgabe im Repo
	 * @param aufgabe
	 */
	void aktualisiereAufgabe(Aufgabe aufgabe);

}
