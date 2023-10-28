package exercism;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {
    LocalDate ld = null;
    LocalDateTime dt = null;

    public Gigasecond(LocalDate moment) {
	this.ld = moment;
    }

    public Gigasecond(LocalDateTime moment) {
	this.dt = moment;
    }

    public LocalDateTime getDateTime() {
	if (ld != null) {
	    LocalDateTime ldt = ld.atStartOfDay();
	    return ldt.plusSeconds(1000000000);
	}
	return dt.plusSeconds(1000000000);
    }
}
