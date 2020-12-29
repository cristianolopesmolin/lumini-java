package br.com.lumini.avaliacao.controller;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.lumini.avaliacao.dto.request.NewUserRequest;
import br.com.lumini.avaliacao.dto.response.UserResponse;
import br.com.lumini.avaliacao.model.User;
import br.com.lumini.avaliacao.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping
	private ResponseEntity<UserResponse> newUser(@RequestBody @Valid NewUserRequest req, UriComponentsBuilder uriBuilder){
		User user = userRepository.save(req.requestToEntity());
		
		URI uri = uriBuilder.path("/user/id").buildAndExpand(user.getId()).toUri();
		
		return ResponseEntity.created(uri).body(new UserResponse(user));
	}

}
