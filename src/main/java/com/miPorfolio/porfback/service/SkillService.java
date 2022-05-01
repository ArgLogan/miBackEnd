package com.miPorfolio.porfback.service;

import com.miPorfolio.porfback.model.Skill;
import com.miPorfolio.porfback.repository.SkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService implements ISkillService {
    @Autowired
    public SkillRepository skillRepo;
    
    @Override
    public List<Skill> verSkills() {
        return skillRepo.findAll();
    }

    @Override
    public void crearSkill(Skill habil) {
        skillRepo.save(habil);
    }

    @Override
    public void borrarSkill(Long id) {
        skillRepo.deleteById(id);
    }

    @Override
    public Skill buscarSkill(Long id) {
        return skillRepo.findById(id).orElse(null);
    }

    @Override
    public void actualizaSkill(Skill habil) {
        skillRepo.save(habil);
    }
    
}
