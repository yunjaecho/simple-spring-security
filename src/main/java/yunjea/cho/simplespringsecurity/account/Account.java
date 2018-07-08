package yunjea.cho.simplespringsecurity.account;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ACCOUNT")
public class Account {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "EMAIL", nullable = false, unique = true)
    private String username;

    @Column(name = "PASS", nullable = false)
    private String password;

    @Transient
    private final String[] roles = {"ROLE_USER"};

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
