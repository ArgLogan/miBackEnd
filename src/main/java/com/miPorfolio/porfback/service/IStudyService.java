package com.miPorfolio.porfback.service;

import com.miPorfolio.porfback.model.Study;
import java.util.List;

public interface IStudyService {
    public List<Study> verStudys();
    
    public void crearStudy(Study estu);
    
    public void  borrarStudy (Long id);
    
    public Study buscarStudy  (Long id);
    
    public void actualizaStudy  (Study estu);

}
