package se1app.applicationcore.util;

import java.io.Serializable;
import java.time.LocalDateTime;

public class TimestampTyp implements Serializable{

	public TimestampTyp(TimestampTyp timestampTyp) {
		this.zeitStempel = timestampTyp.zeitStempel;
	}
	
	public TimestampTyp(LocalDateTime zeitStempel) {
		this.zeitStempel = zeitStempel;
	}
	
	private LocalDateTime zeitStempel;

}
