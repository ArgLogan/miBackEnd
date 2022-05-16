package com.miPorfolio.porfback.cotroller;

import com.miPorfolio.porfback.model.Experiencia;
import com.miPorfolio.porfback.model.Header;
import com.miPorfolio.porfback.model.Persona;
import com.miPorfolio.porfback.model.Proyect;
import com.miPorfolio.porfback.model.Skill;
import com.miPorfolio.porfback.model.Study;
import com.miPorfolio.porfback.model.Users;
import com.miPorfolio.porfback.service.IExperienciaService;
import com.miPorfolio.porfback.service.IHeaderService;
import com.miPorfolio.porfback.service.IPersonaService;
import com.miPorfolio.porfback.service.IProyectService;
import com.miPorfolio.porfback.service.ISkillService;
import com.miPorfolio.porfback.service.IStudyService;
import com.miPorfolio.porfback.service.IUsersService;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
    
    @Autowired IPersonaService persoServ;
    @Autowired IStudyService estServ;
    @Autowired ISkillService habilServ;
    @Autowired IExperienciaService expServ;
    @Autowired IHeaderService headServ;
    @Autowired IProyectService proServ;
    @Autowired IUsersService userServ;

    
//--------------------------- PERSONA ------------------------------  
    @PostMapping("/persona/new")
    public void agregarPersona(@RequestBody Persona pers){
       persoServ.crearPersona(pers);
    }
    @GetMapping("/persona/ver")
    @ResponseBody    
    public List<Persona> verPersonas(){
        return persoServ.verPersonas();
    }
    @DeleteMapping ("/persona/delete/{id}")
    public void borrarPersona ( @PathVariable Long id){
        persoServ.borrarPersona(id);
    }
    @PostMapping("/persona/update")
    public void acualizaPersona(@RequestBody Persona pers ){
        persoServ.atualizarPerona(pers);
    } 
//-----------------------------------------------------------------------
   

//----------------------------STUDY---------------------------------------
    @PostMapping("/study/new")
    public void agregaStudy(@RequestBody Study estudio ){
        estServ.crearStudy(estudio);
    } 
    @GetMapping("/study/ver")
    @ResponseBody    
    public List<Study> verStudys(){
        return estServ.verStudys();
    }
    @DeleteMapping ("/study/delete/{id}")
    public void borrarStudy ( @PathVariable Long id){
        estServ.borrarStudy(id);
    }
    @PostMapping("/study/update")
    public void acualizaStudy(@RequestBody Study estudio ){
        estServ.actualizaStudy(estudio);
    } 
      
    
//----------------------------------------------------------------------    


//-------------------------SKILS-------------------------------------------
    @PostMapping("/skill/new")
    public void agregaSkill(@RequestBody Skill habilidad ){
        habilServ.crearSkill(habilidad);
    } 
    @GetMapping("/skill/ver")
    @ResponseBody    
    public List<Skill> verStkills(){
        return habilServ.verSkills();
    }
    @DeleteMapping ("/skill/delete/{id}")
    public void borrarSkill ( @PathVariable Long id){
        habilServ.borrarSkill(id);
    }
    @PostMapping("/skill/update")
    public void acualizaSkill(@RequestBody Skill habilidad ){
        habilServ.actualizaSkill(habilidad);
    } 

//-------------------------------------------------------------------------


//-------------------------EXPERIENCIA-------------------------------------------
    @PostMapping("/experiencia/new")
    public void agregaExperiencia(@RequestBody Experiencia exp ){
        expServ.crearExperiencia(exp);
    } 
    @GetMapping("/experiencia/ver")
    @ResponseBody    
    public List<Experiencia> verExperiencias(){
        return expServ.verExperiencias();
    }
    @DeleteMapping ("/experiencia/delete/{id}")
    public void borrarExperiencias ( @PathVariable Long id){
        expServ.borraExperiencia(id);
    }
    @PostMapping("/experiencia/update")
    public void acualizaExperiencias(@RequestBody Experiencia exp ){
        expServ.actualizarExperiencia(exp);
    } 

//-------------------------------------------------------------------------
    
//-------------------------HEADER------------------------------------------
    @PostMapping("/header/new")
    public void agregaHeader(@RequestBody Header head ){
        headServ.crearHeader(head);
    } 
    @GetMapping("/header/ver")
    @ResponseBody    
    public List<Header> verHeader(){
        return headServ.verHeader();
    }
    @DeleteMapping ("/header/delete/{id}")
    public void borrarHeader ( @PathVariable Long id){
        headServ.borraHeader(id);
    }
    @PostMapping("/header/update")
    public void acualizaHeader(@RequestBody Header head ){
        headServ.actualizarHeder(head);
    } 
//-------------------------------------------------------------------------    
    
//-------------------------Proyect------------------------------------------
    @PostMapping("/proyect/new")
    public void agregaproyect(@RequestBody Proyect proye ){
        proServ.crearProyect(proye);
    }
    @GetMapping("/proyect/ver")
    @ResponseBody    
    public List<Proyect> verProyecto(){
        return proServ.verProyect();
    }
    @DeleteMapping ("/proyect/delete/{id}")
    public void borrarProyect ( @PathVariable Long id){
        proServ.borraProyect(id);
    }
    @PostMapping("/proyect/update")
    public void acualizaProyect(@RequestBody Proyect proyec ){
        proServ.actualizarProyect(proyec);
    } 
//-------------------------------------------------------------------------  


//-------------------------Usuarios------------------------------------------
    @PostMapping("/user/new")
    public void agregaUser(@RequestBody Users user ){
        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
        String hash = argon2.hash(1, 1024, 1, user.getPassword());
        user.setPassword(hash);
        userServ.crearUser(user);
    }
    @GetMapping("/user/ver")
    @ResponseBody    
    public List<Users> verUser(){
        return userServ.verUsers();
    }
    @DeleteMapping ("/user/delete/{id}")
    public void borrarUser ( @PathVariable Long id){
        userServ.borrarUser(id);
    }
    @PostMapping("/user/update")
    public void acualizaUser(@RequestBody Users user ){
        userServ.atualizarUser(user);
    }   
    @PostMapping("/user/ok")
    @ResponseBody    
    public boolean verUser(@RequestBody Users user){
        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
        List<Users> usuarios =  userServ.verUsers();
        
        for( Users x:usuarios){
            if((argon2.verify(x.getPassword(), user.getPassword()))&&(x.getUsuario().equals(user.getUsuario())) ){
                x.setValido(true);
                return true;
            }
   
        }
        return false;
    }
    
    
//------------------------------------------------------------------------- 
}