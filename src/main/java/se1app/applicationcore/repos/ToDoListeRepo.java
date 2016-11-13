package se1app.applicationcore.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import se1app.applicationcore.ToDoListe;

public interface ToDoListeRepo extends JpaRepository<ToDoListe, Integer> {

}
