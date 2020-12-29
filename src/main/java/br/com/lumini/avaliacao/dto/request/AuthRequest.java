package br.com.lumini.avaliacao.dto.request;

import javax.validation.constraints.NotEmpty;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

import com.sun.istack.NotNull;

import lombok.Data;

@Data
public class AuthRequest {
	
	@NotNull
	@NotEmpty
	private String email;
	
	@NotNull
	@NotEmpty
	private String password;

	public UsernamePasswordAuthenticationToken toLogin() {
		return new UsernamePasswordAuthenticationToken(email, password);
	}


}
