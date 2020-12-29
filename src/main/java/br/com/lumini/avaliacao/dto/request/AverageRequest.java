package br.com.lumini.avaliacao.dto.request;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class AverageRequest {
	
	@NotNull
	private BigDecimal firstValue;
	
	@NotNull
	private BigDecimal secondValue;

}
