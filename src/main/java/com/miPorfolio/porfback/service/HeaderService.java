
package com.miPorfolio.porfback.service;

import com.miPorfolio.porfback.model.Header;
import com.miPorfolio.porfback.repository.HeaderRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HeaderService implements IHeaderService{
    
    @Autowired
    public HeaderRepository headerrepo;

    @Override
    public List<Header> verHeader() {
        return headerrepo.findAll();
    }

    @Override
    public void crearHeader(Header head) {
        headerrepo.save(head);
    }

    @Override
    public void borraHeader(Long id) {
        headerrepo.deleteById(id);
    }

    @Override
    public Header buscarHeader(Long id) {
        return headerrepo.findById(id).orElse(null);
    }

    @Override
    public void actualizarHeder(Header head) {
        headerrepo.save(head);
    }
    
    
}
