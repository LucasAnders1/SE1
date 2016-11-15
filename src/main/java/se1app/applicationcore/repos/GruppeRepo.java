package se1app.applicationcore.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import se1app.applicationcore.Gruppe;

@Repository
public interface GruppeRepo extends JpaRepository<Gruppe, Integer> {

}
