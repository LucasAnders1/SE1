package se1app.applicationcore.usecases;

import org.springframework.beans.factory.annotation.Autowired;

import se1app.applicationcore.Aufgabe;
import se1app.applicationcore.repos.AufgabeRepo;

public class AufgabeBearbeitenImpl implements AufgabeBearbeiten {

	@Autowired
	AufgabeRepo aufgabeRepo;
	
	@Override
	public Aufgabe findAufgabeByName(String name) {
		return aufgabeRepo.findAufgabeByName(name);
	}

	@Override
	public void aktualisiereAufgabe(Aufgabe aufgabe) {
		aufgabeRepo.save(aufgabe);
	}

}
