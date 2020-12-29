package br.com.lumini.avaliacao.dto.response;

import br.com.lumini.avaliacao.model.User;
import lombok.Getter;

@Getter
public class UserResponse {
	
	private Long id;
	private String name;
	private String email;
	
	public UserResponse() {
	}
	
	public UserResponse(User user) {
		this.id = user.getId();
		this.name = user.getName();
		this.email = user.getEmail();
	}

}
