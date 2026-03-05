package br.com.cursoMc.projetoOrientado.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cursoMc.projetoOrientado.domain.Cliente;
import br.com.cursoMc.projetoOrientado.repository.ClienteRepository;
import br.com.cursoMc.projetoOrientado.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

    @Autowired
    private  ClienteRepository repo;

    public Cliente find(Integer id) {
         Optional<Cliente> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                        "Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
}
        

    }
    

