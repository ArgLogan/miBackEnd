
package com.miPorfolio.porfback.repository;

import com.miPorfolio.porfback.model.Study;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudyRepository extends JpaRepository <Study, Long> {
    
}
