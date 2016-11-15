package se1app.applicationcore.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import se1app.applicationcore.Benutzer;
import se1app.applicationcore.ToDoListe;

public interface BenutzerRepo extends JpaRepository<Benutzer, Integer> {

//	List<ToDoListe> findhatListen();

}
