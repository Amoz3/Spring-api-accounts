package com.example.demo.accounts;


import javax.persistence.*;

@Entity
@Table
public class Account {
    @Id
    @SequenceGenerator(
            name = "account_sequence",
            sequenceName = "account_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "account_sequence"
    )

    private Long id;
    private String email;
    private String password;
    private Integer bankPin;

    public Account() {}

    public Account(String email, String password, Integer bankPin) {
        this.email = email;
        this.password = password;
        this.bankPin = bankPin;
    }

    public Account(Long id, String email, String password, Integer bankPin) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.bankPin = bankPin;
    }

    public Integer getBankPin() {
        return bankPin;
    }

    public void setBankPin(Integer bankPin) {
        this.bankPin = bankPin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
