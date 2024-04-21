// from https://exercism.org/tracks/java/exercises/booking-up-for-beauty

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        return LocalDateTime.parse(appointmentDateDescription, parser);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return appointmentDate.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        int aptHour = appointmentDate.getHour();
        return aptHour > 11 && aptHour < 18;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        int year = appointmentDate.getYear();
        String month = appointmentDate.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        int numDay = appointmentDate.getDayOfMonth();
        String nameDay = appointmentDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        int hour = appointmentDate.getHour();
        int min = appointmentDate.getMinute();
        String minute = String.valueOf(min);
        String mornOrAft = "AM";

        if (hour > 11) {
            hour = (hour > 12) ? (hour - 12) : hour;
            mornOrAft = "PM";
        }
        if (min < 10) {
            minute = "0" + minute;
        }

        return "You have an appointment on " + nameDay + ", " + month + " " + numDay + ", " + year + ", at " + hour + ":" + minute + " " + mornOrAft + ".";
    }

    public LocalDate getAnniversaryDate() {
        return LocalDate.of(2024, 9, 15);
    }
}

// learning date time in Java. This was challenging. Admittedly, I struggle w/ date time in JS, too. It's hard to work
// w/ and wrap my mind around. But I think I did well with this challenge (though it took me a lot of time and doc 
// reading).