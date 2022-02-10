package com.app.server.tcambio.dto;

public class RespuestaErrorDto {
	private String campo;
	private String mensaje;
	public String getCampo() {
		return campo;
	}
	public void setCampo(String campo) {
		this.campo = campo;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public RespuestaErrorDto(String campo, String mensaje) {
		super();
		this.campo = campo;
		this.mensaje = mensaje;
	}
	public RespuestaErrorDto(String mensaje) {
		super();
		this.mensaje = mensaje;
	}
}
