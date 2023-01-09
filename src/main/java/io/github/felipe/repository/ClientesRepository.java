package io.github.felipe.repository;

import io.github.felipe.model.Cliente;
import org.springframework.stereotype.Repository;

@Repository
public class ClientesRepository {

    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        ClientesRepository clientesRepository = new ClientesRepository();
        clientesRepository.persistir(cliente);

    }

    public void persistir(Cliente cliente) {

    }

    public void validarCliente(Cliente client){

    }
}
