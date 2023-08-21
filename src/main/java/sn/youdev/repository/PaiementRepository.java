package sn.youdev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.youdev.model.Declaration;
import sn.youdev.model.Paiement;

import java.util.Collection;
import java.util.List;

@Repository
public interface PaiementRepository extends JpaRepository<Paiement, Long> {
    List<Paiement>findPaiementsByDeclaration_Id(Long id);


}