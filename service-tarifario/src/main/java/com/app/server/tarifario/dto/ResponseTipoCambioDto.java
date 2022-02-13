package com.app.server.tarifario.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTipoCambioDto {
	
	private String monedaOrigen;
	private String monedaDestino;
	private BigDecimal tipoCambio;
	private BigDecimal montoTipoCambio;
	
	}
