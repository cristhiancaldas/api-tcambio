package com.app.server.tarifario.dto;

import java.math.BigDecimal;

public class ResponseTipoCambioDto {
	
	private BigDecimal montoTipoCambio;
	private String monedaOrigen;
	private String monedaDestino;
	private BigDecimal tipoCambio;
	
	public BigDecimal getTipoCambio() {
		return tipoCambio;
	}
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
