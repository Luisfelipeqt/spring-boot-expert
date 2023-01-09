package io.github.felipe.service;

import io.github.felipe.model.Cliente;
import io.github.felipe.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {
    @Autowired
    public ClientesService(ClientesRepository repository){
    }



    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        ClientesRepository clientesRepository = new ClientesRepository();
        clientesRepository.persistir(cliente);


    }

    public void validarCliente(Cliente cliente){

    }
}
