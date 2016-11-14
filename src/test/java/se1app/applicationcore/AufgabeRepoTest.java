//package se1app.applicationcore;
//
//import static org.junit.Assert.assertThat;
//
//import java.awt.Color;
//import java.time.LocalDateTime;
//import java.util.List;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.transaction.annotation.Transactional;
//
//import se1app.applicationcore.repos.AufgabeRepo;
//import se1app.applicationcore.repos.BenutzerRepo;
//import se1app.applicationcore.repos.ToDoListeRepo;
//import se1app.applicationcore.util.DatumTyp;
//import se1app.applicationcore.util.EmailType;
//import se1app.applicationcore.util.TimestampTyp;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@Transactional
//@ContextConfiguration(classes = Application.class)
//public class AufgabeRepoTest {
//
//	@Autowired
//	private AufgabeRepo aufgabeRepo;
//	@Autowired
//	private ToDoListeRepo toDoListeRepo;
//	@Autowired
//	private BenutzerRepo benutzerRepo;
//	
//	@Before
//	public void setUp() throws Exception {
//		Aufgabe a1 = new Aufgabe(1, "Oma anrufen", "von Oma zum Mittag einladen lassen", 1, new TimestampTyp(LocalDateTime.parse("2016-11-14T10:11:30")),
//				new DatumTyp(LocalDateTime.parse("2016-11-21")),
//				new List<Benutzer>(), new Kategorie(1,"wichtig",new Color(255, 0, 0)));
//		Aufgabe a2 = new Aufgabe(2, "Gassi gehen", "im Park Gassi gehen",2, new TimestampTyp(LocalDateTime.parse("2016-11-14T10:12:40")),
//				new DatumTyp(LocalDateTime.parse("2016-11-21")),
//				new List<Benutzer>(), new Kategorie(1,"wichtig",new Color(255, 0, 0)));
//		Benutzer b1 = new Benutzer(1, "Hansi", "Hans", "Mueller", "1234", new EmailType("hansi123@web.de"),
//				List<ToDoListe> hatListen, List<ToDoListe> istMitglied, List<ToDoListe> istAdmin));
//		
//	}
//
//	@Test
//	public void testSaveAufgabe() {
//		toDoListeRepo.saveAufgabe(a1);
//		toDoListeRepo.saveAufgabe(a2);
//		Benutzer benutzer = benutzerRepo.findBenutzerByName("Hans");
//		assertThat(toDoListeRepo.findListsByBenutzer().size() == 2);
//	}
//
//}
