package se1app.applicationcore.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import se1app.applicationcore.Kategorie;

@Repository
public interface KategorieRepo extends JpaRepository<Kategorie, Integer> {

}
