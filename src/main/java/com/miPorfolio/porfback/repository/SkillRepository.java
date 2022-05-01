
package com.miPorfolio.porfback.repository;

import com.miPorfolio.porfback.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends JpaRepository <Skill, Long>  {
    
}
