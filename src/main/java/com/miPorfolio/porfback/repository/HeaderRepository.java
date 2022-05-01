
package com.miPorfolio.porfback.repository;

import com.miPorfolio.porfback.model.Header;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeaderRepository extends JpaRepository<Header, Long>{
    
}
