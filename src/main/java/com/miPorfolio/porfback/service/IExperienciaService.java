package com.miPorfolio.porfback.service;

import com.miPorfolio.porfback.model.Experiencia;
import java.util.List;

public interface IExperienciaService {
    
    public List<Experiencia> verExperiencias ();
    
    public void crearExperiencia (Experiencia exp);
    
    public void borraExperiencia (Long id);
    
    public Experiencia buscarExperiencia (Long id);
    
    public void actualizarExperiencia (Experiencia exp);
 
}
