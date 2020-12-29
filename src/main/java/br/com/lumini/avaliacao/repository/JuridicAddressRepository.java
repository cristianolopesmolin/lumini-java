package br.com.lumini.avaliacao.repository;

import java.util.Optional;

import org.hibernate.validator.constraints.br.CNPJ;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lumini.avaliacao.model.JuridicAddress;

public interface JuridicAddressRepository extends JpaRepository<JuridicAddress, Long>{

	Optional<JuridicAddress> findByCnpj(@CNPJ String cnpj);

}
