package com.example.Banques.Banque.Models;
import org.springframework.data.annotation.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
@Entity
public class Login {
    @Id 
    private String Id;
    @Column(name="identity")
    private int identity;
    @Column(name = "password")
    private String passwod;
    @OneToMany
    private User user;
}