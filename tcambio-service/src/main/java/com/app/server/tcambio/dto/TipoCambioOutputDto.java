package com.app.server.tcambio.dto;

import java.math.BigDecimal;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class TipoCambioOutputDto {
	
	@NotEmpty
	@Size(min = 3, message = "Ingresar 3 caracteres")
	private String monedaOrigen;
	
	@NotEmpty
	@Size(min = 3, message = "Ingresar 3 caracteres")
	private String monedaDestino;
	private BigDecimal tipoCambio;
	private BigDecimal montoTipoCambio;
	
	public String getMonedaOrigen() {
		return monedaOrigen;
	}
	public void setMonedaOrigen(String monedaOrigen) {
		this.monedaOrigen = monedaOrigen;
	}
	public String getMonedaDestino() {
		return monedaDestino;
	}
	public void setMonedaDestino(String monedaDestino) {
		this.monedaDestino = monedaDestino;
	}
	public BigDecimal getTipoCambio() {
		return tipoCambio;
	}
	public void setTipoCambio(BigDecimal tipoCambio) {
		this.tipoCambio = tipoCambio;
	}
	public BigDecimal getMontoTipoCambio() {
		return montoTipoCambio;
	}
	public void setMontoTipoCambio(BigDecimal montoTipoCambio) {
		this.montoTipoCambio = montoTipoCambio;
	}
}
