package se1app.applicationcore.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import se1app.applicationcore.Aufgabe;

public interface AufgabeRepo extends JpaRepository<Aufgabe, Integer>{
	
	

}
