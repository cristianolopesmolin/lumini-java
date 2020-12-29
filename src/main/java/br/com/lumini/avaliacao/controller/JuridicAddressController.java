package br.com.lumini.avaliacao.controller;

import java.util.Optional;

import org.hibernate.validator.constraints.br.CNPJ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lumini.avaliacao.dto.response.AddressResponse;
import br.com.lumini.avaliacao.model.JuridicAddress;
import br.com.lumini.avaliacao.repository.JuridicAddressRepository;

@RestController
@RequestMapping("/juridic-address")
public class JuridicAddressController {
	
	@Autowired
	private JuridicAddressRepository juridicAddressRepository;
	
	@GetMapping("/{cnpj}")
	private ResponseEntity<AddressResponse> getAddressByCNPJ(@PathVariable @CNPJ final String cnpj){
		Optional<JuridicAddress> addressOP = juridicAddressRepository.findByCnpj(cnpj);
		
		if(addressOP.isPresent()) {			
			return ResponseEntity.ok(new AddressResponse(addressOP.get()));
		}
		
		return ResponseEntity.notFound().build();
	}

}
