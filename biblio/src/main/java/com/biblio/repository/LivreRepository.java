package com.biblio.repository;

import com.biblio.model.Livre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface LivreRepository extends JpaRepository<Livre, Long> {
    List<Livre> findByTitreContaining(String titre);
    List<Livre> findByAuteurContaining(String auteur);
}
