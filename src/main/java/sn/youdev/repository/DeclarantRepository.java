package sn.youdev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.youdev.model.Declarant;

@Repository
public interface DeclarantRepository extends JpaRepository<Declarant, Long> {

}