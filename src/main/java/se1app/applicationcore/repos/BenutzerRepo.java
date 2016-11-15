package se1app.applicationcore.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import se1app.applicationcore.Benutzer;
import se1app.applicationcore.ToDoListe;

@Repository 
public interface BenutzerRepo extends JpaRepository<Benutzer, Integer> {

//	List<ToDoListe> findToDoListByhatListen();
	Benutzer findBenutzerByVorname(String name);

}
