
package com.miPorfolio.porfback.service;

import com.miPorfolio.porfback.model.Experiencia;
import com.miPorfolio.porfback.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService{
    @Autowired
    public ExperienciaRepository Experienciarepo;

    @Override
    public List<Experiencia> verExperiencias() {
        return Experienciarepo.findAll();
    }

    @Override
    public void crearExperiencia(Experiencia exp) {
        Experienciarepo.save(exp);
    }

    @Override
    public void borraExperiencia(Long id) {
        Experienciarepo.deleteById(id);
    }

    @Override
    public Experiencia buscarExperiencia(Long id) {
        return Experienciarepo.findById(id).orElse(null);
    }

    @Override
    public void actualizarExperiencia(Experiencia exp) {
        Experienciarepo.save(exp);
    }
    
}
