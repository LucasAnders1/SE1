package se1app.applicationcore.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import se1app.applicationcore.Benutzer;

public interface BenutzerRepo extends JpaRepository<Benutzer, Integer> {

}
