package com.miPorfolio.porfback.service;

import com.miPorfolio.porfback.model.Study;
import com.miPorfolio.porfback.repository.StudyRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class StudyService implements IStudyService {
    @Autowired
    public StudyRepository studyRepo;

    @Override
    public List<Study> verStudys() {
        return studyRepo.findAll();
    }

    @Override
    public void crearStudy(Study estudio) {
        studyRepo.save(estudio);
    }

    @Override
    public void borrarStudy(Long id) {
        studyRepo.deleteById(id);
    }

    @Override
    public Study buscarStudy(Long id) {
        return studyRepo.findById(id).orElse(null);
    }

    @Override
    public void actualizaStudy(Study estu) {
        studyRepo.save(estu);
    }
    
}
