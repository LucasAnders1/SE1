package se1app.applicationcore.util;

import java.io.Serializable;
import java.time.LocalDateTime;

public class DatumTyp implements Serializable {

	public DatumTyp(DatumTyp datumTyp) {
		this.datum = datumTyp.datum;
	}

	public DatumTyp(LocalDateTime datum) {
		this.datum = datum;
	}
	
	private LocalDateTime datum;
}
