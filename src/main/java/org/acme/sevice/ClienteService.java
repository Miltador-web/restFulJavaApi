package org.acme.sevice;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import org.acme.entity.Cliente;
import org.acme.repository.ClienteRepository;

import java.util.List;

@ApplicationScoped
public class ClienteService {
    @Inject
    ClienteRepository clienteRepository;

    public List<Cliente> obtemTodosDados(){
        return clienteRepository.findAll().list();
    }

    public Cliente obtemUnicoCliente(Long id){
        return clienteRepository.findById(id);
    }
    @Transactional
    public Cliente inserirCliente(Cliente cliente){
        clienteRepository.persist(cliente);
        return cliente;
    }
}
