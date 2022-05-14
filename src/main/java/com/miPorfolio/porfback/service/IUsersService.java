
package com.miPorfolio.porfback.service;

import com.miPorfolio.porfback.model.Users;
import java.util.List;

public interface IUsersService {
    public List<Users> verUsers();
    
    public void crearUser(Users user);
    
    public void  borrarUser (Long id);
    
    public Users buscarUser  (Long id);
    
    public void atualizarUser(Users user);
    
}
