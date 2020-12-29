package br.com.lumini.avaliacao.controller;

import java.math.BigDecimal;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lumini.avaliacao.dto.request.AverageRequest;

@RestController
@RequestMapping("/average")
public class AverageController {
	
	@PostMapping
	public ResponseEntity<BigDecimal> getAverage(@RequestBody @Valid AverageRequest request) {
		return ResponseEntity.ok(request.getFirstValue().add(request.getSecondValue()).divide(new BigDecimal(2)));
	}

}
