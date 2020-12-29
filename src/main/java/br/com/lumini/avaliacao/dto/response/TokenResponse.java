package br.com.lumini.avaliacao.dto.response;

import br.com.lumini.avaliacao.model.User;
import lombok.Getter;

@Getter
public class TokenResponse {
	
	private String token;
	private String type;
	private String name;
	private Long userId;

	public TokenResponse() {
	}

	public TokenResponse(String token, String type, User user) {
		this.token = token;
		this.type = type;
		this.name = user.getName();
		this.userId = user.getId();
	}

}
