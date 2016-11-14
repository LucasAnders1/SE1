package se1app.applicationcore.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import se1app.applicationcore.Benutzer;
import se1app.applicationcore.ToDoListe;

public interface ToDoListeRepo extends JpaRepository<ToDoListe, Integer> {

	List<ToDoListe> findListsByBenutzer(Benutzer benutzerNr);
}
