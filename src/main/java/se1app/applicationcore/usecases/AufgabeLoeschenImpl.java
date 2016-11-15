//package se1app.applicationcore.usecases;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//import se1app.applicationcore.Aufgabe;
//import se1app.applicationcore.repos.AufgabeRepo;
//
//public class AufgabeLoeschenImpl implements AufgabeLoeschen {
//
//	
//	@Autowired
//	private AufgabeRepo aufgabeRepo;
//	
//	@Override
//	public Aufgabe findAufgabeByName(String name) {
//		return aufgabeRepo.findAufgabeByName(name);
//	}
//
//	@Override
//	public void loescheAufgabe(Aufgabe aufgabe) {
//		aufgabeRepo.delete(aufgabe);
//		
//	}
//
//}
