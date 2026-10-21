package tn.esprit.spring.mehdilaribi4cce10.service;

import java.util.List;
import tn.esprit.spring.mehdilaribi4cce10.domain.Paiement;

public interface IPaiementService {
    Paiement findById(Long id);
    List<Paiement> findAll();
}