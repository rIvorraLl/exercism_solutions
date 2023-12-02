package exercism;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
	DateTimeFormatter parser = DateTimeFormatter
		.ofPattern("MM/dd/yyyy HH:mm:ss");
	LocalDateTime parsed = LocalDateTime.parse(appointmentDateDescription,
		parser);
	return parsed;
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
	LocalDateTime now = LocalDateTime.now();
	return appointmentDate.isBefore(now);

    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
	int hour = appointmentDate.getHour();
	return hour >= 12 && hour < 18;
    }

    public String getDescription(LocalDateTime appointmentDate) {
	String pattern = "'You have an appointment on 'EEEE, MMMM d, yyyy, 'at' h:mm a.";
	return appointmentDate.format(DateTimeFormatter.ofPattern(pattern));
    }

    public LocalDate getAnniversaryDate() {
	LocalDate anniversary = LocalDate.of(LocalDate.now().getYear(), 9, 15);
	return anniversary;
    }
}
