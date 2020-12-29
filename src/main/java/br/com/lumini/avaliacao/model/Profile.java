package br.com.lumini.avaliacao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import org.springframework.security.core.GrantedAuthority;
import lombok.Data;

@Entity
@Table(name = "profiles")
@SequenceGenerator(name = "profiles_id_seq", sequenceName = "profiles_id_seq", allocationSize = 1)
@Data
public class Profile implements GrantedAuthority {

	private static final long serialVersionUID = 7957921085891409085L;

	@Id
	@GeneratedValue(generator = "profiles_id_seq", strategy = GenerationType.SEQUENCE)
	private Long id;

	@Column(name = "txt_name")
	private String name;

	@Override
	public String getAuthority() {
		return name;
	}

}
