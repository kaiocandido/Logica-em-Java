import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("M/d/yyyy HH:mm:ss");
        LocalDateTime data = LocalDateTime.parse(appointmentDateDescription, formato);

        return data;
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        LocalDateTime dateNow = LocalDateTime.now();

        if(appointmentDate.isBefore(dateNow)){
            return true;
        }

        return false;
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        double hora = appointmentDate.getHour();

        if(hora >= 12 && hora < 18){
            return true;
        }

        return false;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy, 'at' h:mm a", Locale.ENGLISH);

        String dataFormatada = appointmentDate.format(formato);

        return  "You have an appointment on " + dataFormatada + ".";

    }

    public LocalDate getAnniversaryDate() {
        LocalDateTime dateNow = LocalDateTime.now();
        int anoAtual = dateNow.getYear();
        String dataFixa = "09/15/" + anoAtual;
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        LocalDate data = LocalDate.parse(dataFixa, formato);

        return data;

    }
}
