package se1app.applicationcore.repos;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import se1app.applicationcore.Aufgabe;
import se1app.applicationcore.Benutzer;
import se1app.applicationcore.ToDoListe;

@Repository
public interface ToDoListeRepo extends JpaRepository<ToDoListe, Integer> {

	@Query(value = "SELECT * FROM TODOLISTE WHERE EXISTS(SELECT * FROM BENUTZER_HATLISTEN WHERE TODOLISTE.ID = BENUTZER_HATLISTEN.TODOLISTE_ID AND BENUTZER_HATLISTEN.BENUTZERID := benutzerNr)", nativeQuery = true)
	List<ToDoListe> findListsByBenutzer(@Param("benutzerNr") Benutzer benutzerNr);
	
	List<Aufgabe> findAufgabenByhatAufgaben(ToDoListe liste);

//	List<Aufgabe> findhatAufgabenByToDoListe(ToDoListe toDoListe);
}
