package com.candidate.chedly;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Candidat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String email;

    private String prenom;

    public Candidat() {
    }

    public Candidat(String nom, String email, String prenom) {
        this.nom = nom;
        this.email = email;
        this.prenom = prenom;
    }

    



}
