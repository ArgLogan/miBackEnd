
package com.miPorfolio.porfback.service;

import com.miPorfolio.porfback.model.Proyect;
import com.miPorfolio.porfback.repository.ProyectRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectService implements IProyectService {
    @Autowired
    public ProyectRepository proyectRepo;

    @Override
    public List<Proyect> verProyect() {
        return proyectRepo.findAll();
    }

    @Override
    public void crearProyect(Proyect proye) {
        proyectRepo.save(proye);
    }

    @Override
    public void borraProyect(Long id) {
        proyectRepo.deleteById(id);
    }

    @Override
    public Proyect buscarProyect(Long id) {
        return proyectRepo.findById(id).orElse(null);
    }

    @Override
    public void actualizarProyect(Proyect proye) {
        proyectRepo.save(proye);
    }
    
    
}
