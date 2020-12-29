package br.com.lumini.avaliacao.dto.response;

import br.com.lumini.avaliacao.model.JuridicAddress;
import br.com.lumini.avaliacao.util.DocumentUtils;
import br.com.lumini.avaliacao.util.StringUtils;
import lombok.Getter;

@Getter
public class AddressResponse {
	
	private Long id;
	private String cnpj;
	private String cep;
	private String street;
	private String number;
	private String complement;
	private String neighborhood;
	private String city;
	private String ufShortName;
	private String ufFullName;
	
	public AddressResponse() {
	}
	
	public AddressResponse(JuridicAddress address) {
		this.id = address.getId();
		this.cnpj = DocumentUtils.fillCNPJ(address.getCnpj());
		this.cep = StringUtils.fillCEP(address.getCep());
		this.street = address.getStreet();
		this.number = address.getNumber();
		this.complement = address.getComplement();
		this.neighborhood = address.getNeighborhood();
		this.city = address.getCity();
		this.ufShortName = address.getUf().getShortName();
		this.ufFullName = address.getUf().getFullName();
	}

}
