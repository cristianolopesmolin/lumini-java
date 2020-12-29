package br.com.lumini.avaliacao.dto.request;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import br.com.lumini.avaliacao.model.User;
import lombok.Data;

@Data
public class NewUserRequest {
	
	@NotNull
	@NotEmpty
	private String name;
	
	@NotNull
	@NotEmpty
	private String email;
	
	@NotNull
	@NotEmpty
	private String password;
	
	public User requestToEntity() {
		return new User(name, email, new BCryptPasswordEncoder().encode(password));
	}

}
