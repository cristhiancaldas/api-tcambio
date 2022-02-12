package com.app.server.tcambio.bean;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tarifario {

	private long id;
	private String codigo;
	private String origen;
	private String destino;
	private BigDecimal factor;

}
