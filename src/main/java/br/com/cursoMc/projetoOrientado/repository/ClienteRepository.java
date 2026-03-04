package br.com.cursoMc.projetoOrientado.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cursoMc.projetoOrientado.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    
}
