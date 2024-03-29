package com.edson.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edson.cursomc.domain.Cliente;
import com.edson.cursomc.domain.Cliente;
import com.edson.cursomc.repositories.ClienteRepository;
import com.edson.cursomc.repositories.ClienteRepository;
import com.edson.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repository;
	
	public Cliente buscar(Integer id) {
		Optional<Cliente> obj = repository.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto nao encontrado! id: " + id + ", Tipo: " + Cliente.class.getName()));
	}

}
