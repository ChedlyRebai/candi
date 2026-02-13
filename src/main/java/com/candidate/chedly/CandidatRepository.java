package com.candidate.chedly;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CandidatRepository extends  JpaRepository<Candidat,Long> {


    @Query("select c from Candidat c where c.nom like %:name%")
    List<Candidat> findByNomContaining(@Param("name") String name);
}
