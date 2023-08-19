package sn.youdev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.youdev.model.Declaration;

import java.util.List;

@Repository
public interface DeclarationRepository extends JpaRepository<Declaration, Long> {
    List<Declaration> findAllByDeclarant_Id(Long id);
}