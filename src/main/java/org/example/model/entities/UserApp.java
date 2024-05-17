package org.example.model.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.model.entities.enums.UserRole;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class UserApp {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Integer idUser;

    protected String phoneNumber ;

    protected String email;

    protected String userName;

    protected String password;

    protected String verifyCode;

    protected String name;


    @Enumerated(EnumType.STRING)
    protected UserRole role;

    public UserApp(Integer idUser, String email, String userName, String password, String verifyCode) {
        this.idUser = idUser;
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.verifyCode = verifyCode;
    }

    public UserApp( String email, String password, String role, String namem, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.userName = email;
        this.role = UserRole.valueOf(role);
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public UserApp(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }


    protected String status;

    @Override
    public String toString() {
        return "UserApp{" +
                "email='" + email + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", role=" + role +
                '}';
    }
}
