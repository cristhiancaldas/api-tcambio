package com.app.server.tcambio.dto;

import java.math.BigDecimal;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class TipoCambioInputDto {
	@NotEmpty
	@Size(min = 3, message = "Ingresar 3 caracteres")
	private String monedaOrigen;
	
	@NotEmpty
	@Size(min = 3, message = "Ingresar 3 caracteres")
	private String monedaDestino;
	
	private BigDecimal monto;
	
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
	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	@Override
	public String toString() {
		return "TipoCambioInputDto [monedaOrigen=" + monedaOrigen + ", monedaDestino=" + monedaDestino + ", monto="
				+ monto + "]";
	}
}
