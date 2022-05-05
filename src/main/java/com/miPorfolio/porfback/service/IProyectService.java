package com.miPorfolio.porfback.service;

import com.miPorfolio.porfback.model.Proyect;
import java.util.List;

public interface IProyectService {
    
    public List<Proyect> verProyect();
    
    public void crearProyect (Proyect proye);
    
    public void borraProyect(Long id);
    
    public Proyect buscarProyect(Long id);
    
    public void actualizarProyect(Proyect proye);
    
}
