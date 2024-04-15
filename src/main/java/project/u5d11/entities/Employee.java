package project.u5d11.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String profileImage;

    public Employee(String username, String name, String surname, String email) {
        this.username = username;
        this.firstName = name;
        this.lastName = surname;
        this.email = email;
    }
}
