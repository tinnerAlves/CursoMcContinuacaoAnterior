package br.com.cursoMc.projetoOrientado.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cursoMc.projetoOrientado.domain.Estado;


@Repository
public interface EstadoRepository  extends JpaRepository<Estado, Integer>{
    
}
