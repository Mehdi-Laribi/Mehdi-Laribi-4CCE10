package tn.esprit.spring.mehdilaribi4cce10.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "agence")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Agence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAgence;

    @Column(nullable = false, length = 100)
    private String nom;

    @Column(nullable = false, length = 100)
    private String ville;

    @Column(nullable = false)
    private String adresse;

    @Column(length = 20)
    private String telephone;

    // 1 Agence -> * Employe
    @OneToMany(mappedBy = "agence")
    private Set<Employe> employes = new HashSet<>();

    // 1 Agence -> * Vehicule
    @OneToMany(mappedBy = "agence")
    private Set<Vehicule> vehicules = new HashSet<>();
}