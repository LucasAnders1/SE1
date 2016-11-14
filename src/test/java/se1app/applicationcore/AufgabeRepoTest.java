package se1app.applicationcore;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import se1app.applicationcore.repos.AufgabeRepo;
import se1app.applicationcore.util.DatumTyp;
import se1app.applicationcore.util.TimestampTyp;

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration(classes = Application.class)
public class AufgabeRepoTest {

	@Autowired
	private AufgabeRepo aufgabeRepo;
	
	@Before
	public void setUp() throws Exception {
		Aufgabe a1 = new Aufgabe(1, "Oma anrufen", "von Oma zum Mittag einladen lassen", 1, new TimestampTyp(LocalDateTime.parse("2016-11-14T10:11:30")),
				new DatumTyp(LocalDateTime.parse("2016-11-21")),
				new List<Benutzer>(), new Kategorie(1,"wichtig",new Color(255, 0, 0)));
		Aufgabe a2 = new Aufgabe(2, "Gassi gehen", "im Park Gassi gehen",2, new TimestampTyp(LocalDateTime.parse("2016-11-14T10:12:40")),
				new DatumTyp(LocalDateTime.parse("2016-11-21")),
				new List<Benutzer>(), new Kategorie(1,"wichtig",new Color(255, 0, 0)));
	}

	@Test
	public void test() {
		
	}

}
