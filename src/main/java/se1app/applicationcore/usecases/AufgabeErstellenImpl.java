package se1app.applicationcore.usecases;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import se1app.applicationcore.Aufgabe;
import se1app.applicationcore.AufgabeDTO;
import se1app.applicationcore.Benutzer;
import se1app.applicationcore.repos.ReservationRepository;
import se1app.applicationcore.ToDoListe;
import se1app.applicationcore.repos.AufgabeRepo;
import se1app.applicationcore.repos.ToDoListeRepo;

public class AufgabeErstellenImpl implements AufgabeErstellen{
	
	@Autowired
    private ToDoListeRepo toDoListeRepo;
	@Autowired
    private AufgabeRepo aufgabeRepo;

	@Override
	public List<ToDoListe> findListsByBenutzer(Benutzer benutzer) {
		return toDoListeRepo.findListsByBenutzer(benutzer);
	}

	@Override
	public List<Aufgabe> findAufgabenByList(ToDoListe liste) {
		return aufgabeRepo.findAufgabenByList(liste);
	}

	@Override
	public void saveAufgabe(AufgabeDTO aufgabeDTO) {
		Aufgabe aufgabe = new Aufgabe(aufgabeDTO);
		AufgabeRepo.saveAufgabe(aufgabe);
		
	}

}
