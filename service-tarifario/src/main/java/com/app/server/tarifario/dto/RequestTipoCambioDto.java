package com.app.server.tarifario.dto;

import java.math.BigDecimal;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestTipoCambioDto {
	
	@NotEmpty
	@Size(min = 3, message = "Ingresar 3 caracteres")
	private String monedaOrigen;
	@NotEmpty
	@Size(min = 3, message = "Ingresar 3 caracteres")
	private String monedaDestino;
	private BigDecimal monto;

}
