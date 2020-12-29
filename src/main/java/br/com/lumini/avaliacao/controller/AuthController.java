package br.com.lumini.avaliacao.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lumini.avaliacao.dto.request.AuthRequest;
import br.com.lumini.avaliacao.dto.response.TokenResponse;
import br.com.lumini.avaliacao.model.User;
import br.com.lumini.avaliacao.service.TokenService;

@RestController
@RequestMapping("/auth")
public class AuthController {
	
	@Autowired
	private AuthenticationManager authManager;
	
	@Autowired
	private TokenService tokenService;
	
	@PostMapping
	public ResponseEntity<TokenResponse> authenticate(@RequestBody @Valid AuthRequest req){
		UsernamePasswordAuthenticationToken login = req.toLogin();
		
		Authentication auth = authManager.authenticate(login);
		
		String token = tokenService.generateToken(auth);
		return ResponseEntity.ok(new TokenResponse(token, "Bearer ", (User) auth.getPrincipal()));
	}

}
