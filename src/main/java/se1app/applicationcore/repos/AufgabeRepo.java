package se1app.applicationcore.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import se1app.applicationcore.Aufgabe;
import se1app.applicationcore.ToDoListe;

@Repository
public interface AufgabeRepo extends JpaRepository<Aufgabe, Integer> {

	Aufgabe findAufgabeByName(String name);
}
