package br.com.lumini.avaliacao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import br.com.lumini.avaliacao.enums.UFEnum;
import lombok.Data;

@Entity
@Table(name = "juridic_addresses")
@SequenceGenerator(name = "juridic_addresses_id_seq", sequenceName = "juridic_addresses_id_seq", allocationSize = 1)
@Data
public class JuridicAddress {
	
	@Id
	@GeneratedValue(generator = "juridic_addresses_id_seq", strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@Column(name = "txt_cnpj")
	private String cnpj;
	
	@Column(name = "txt_cep")
	private String cep;
	
	@Column(name = "txt_street")
	private String street;
	
	@Column(name = "txt_number")
	private String number;
	
	@Column(name = "txt_complement")
	private String complement;
	
	@Column(name = "txt_neighborhood")
	private String neighborhood;
	
	@Column(name = "txt_city")
	private String city;
	
	@Column(name = "ind_uf")
	private UFEnum uf;
	
	public JuridicAddress() {
		
	}
	
	public JuridicAddress(final String cnpj, final String cep, final String street, final String number, final String complement, final String neighborhood, final String city, final UFEnum uf) {
		this.cnpj = cnpj;
		this.cep = cep;
		this.street = street;
		this.number = number;
		this.complement = complement;
		this.neighborhood = neighborhood;
		this.city = city;
		this.uf = uf;
	}

}
