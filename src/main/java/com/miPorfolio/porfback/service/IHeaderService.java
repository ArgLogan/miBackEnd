
package com.miPorfolio.porfback.service;

import com.miPorfolio.porfback.model.Header;
import java.util.List;


public interface IHeaderService {
  
    public List<Header> verHeader();
    
    public void crearHeader (Header head);
    
    public void borraHeader(Long id);
    
    public Header buscarHeader(Long id);
    
    public void actualizarHeder(Header head);
}
