package com.miPorfolio.porfback.service;

import com.miPorfolio.porfback.model.Skill;
import java.util.List;


public interface ISkillService {
    public List<Skill> verSkills();
    
    public void crearSkill(Skill habil);
    
    public void  borrarSkill (Long id);
    
    public Skill buscarSkill  (Long id);
    
    public void actualizaSkill  (Skill habil);
    
}
