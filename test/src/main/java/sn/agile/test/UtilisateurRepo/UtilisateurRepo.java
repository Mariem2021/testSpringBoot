package sn.agile.test.UtilisateurRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import sn.agile.test.model.Utilisateur;

@EnableJpaRepositories
@Repository
public interface UtilisateurRepo extends JpaRepository<Utilisateur, Integer> {
}
