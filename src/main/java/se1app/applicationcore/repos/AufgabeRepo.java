package se1app.applicationcore.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import se1app.applicationcore.Aufgabe;
import se1app.applicationcore.ToDoListe;

public interface AufgabeRepo extends JpaRepository<Aufgabe, Integer> {

	Aufgabe findAufgabeByName(String name);
}
