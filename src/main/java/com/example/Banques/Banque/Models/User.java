package com.example.Banques.Banque.Models;
import java.util.Date;
import org.springframework.data.annotation.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
@Entity
public class User {
    @Id
    protected String id;
    @Column(name = "nom")
    protected String nom;
    @Column(name = "prenom")
    protected String prenom;
    @Column(name = "dateNaissance")
    protected Date dateNaissance;
    @Column(name = "age")
    protected int age;
    @Column(name = "ville")
    protected String ville;
    @Column(name = "pays")
    protected String pays;
    @Column(name = "email")
    protected String email;
    @Column(name = "phone")
    protected String phone;
    @Column(name = "identity")
    protected String identity;
    @Column(name = "identifiant")
    protected String identifiant;
    @OneToOne
    protected Login login;
}