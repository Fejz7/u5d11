package project.u5d11.payloads;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
public record EmployeePayload(


        @NotEmpty(message = "il campo username è vuoto")
        @Size(min = 3, max = 30, message = "lo username deve essere tra i 3 e i 30 caratteri")
        String username,

        @NotEmpty(message = "il campo nome è vuoto")
        @Size(min = 3, max = 30, message = "il nome deve essere tra i 3 e i 30 caratteri")
        String name,

        @NotEmpty(message = "il campo cognome è vuoto")
        @Size(min = 3, max = 30, message = "il cognome deve essere tra i 3 e i 30 caratteri")
        String surname,

        @NotEmpty(message = "il campo email è vuoto")
        @Email(message = "l'email non è corretta")
        String eMail) {
}
