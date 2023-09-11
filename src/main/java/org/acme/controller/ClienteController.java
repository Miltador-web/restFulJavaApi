package org.acme.controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import org.acme.entity.Cliente;
import org.acme.sevice.ClienteService;

import java.util.List;

@Path("api/cliente")
public class ClienteController {

    @Inject
    ClienteService clienteService;

    @GET
    public List<Cliente> retornaTodosClientes(){
        return clienteService.obtemTodosDados();
    }

    @GET
    @Path("{id}")
    public Cliente retornaClientePorId(@PathParam("id")Long id){
        return clienteService.obtemUnicoCliente(id);
    }

    @POST
    public Cliente inserirCliente(Cliente cliente){
        return clienteService.inserirCliente(cliente);
    }
}
