//package se1app.applicationcore.usecases;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//import se1app.applicationcore.Aufgabe;
//import se1app.applicationcore.Benutzer;
//import se1app.applicationcore.ToDoListe;
//import se1app.applicationcore.repos.BenutzerRepo;
//import se1app.applicationcore.repos.ToDoListeRepo;
//
//public class AufgabeUebersichtImpl implements AufgabeUebersicht {
//
//	@Autowired
//	BenutzerRepo benutzerRepo;
//	
//	@Autowired
//	ToDoListeRepo toDoListeRepo;
//	
//	
//	@Override
//	public List<Aufgabe> findAufgabenByBenutzer(Benutzer benutzer) {
//		List<Aufgabe> list = new ArrayList<>();
//		for(ToDoListe toDoListe : benutzerRepo.findhatListen()){
//			list.addAll(toDoListeRepo.findhatAufgabenByToDoListe(toDoListe));
//		}
//		return list;
//	}
//
//}
