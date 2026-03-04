package br.com.cursoMc.projetoOrientado.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cursoMc.projetoOrientado.domain.Categoria;
import br.com.cursoMc.projetoOrientado.repository.CategoriaRepository;
import br.com.cursoMc.projetoOrientado.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;

    public Categoria find(Integer id) {
         Optional<Categoria> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                        "Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
}
        

    }
    

