package com.app.server.tarifario.model;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(value="tarifario")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tarifario {

	@Id
	private long id;
	@Column(value = "codigo")
	private String codigo;
	@Column(value = "origen")
	private String origen;
	@Column(value = "destino")
	private String destino;
	@Column(value = "factor")
	private BigDecimal factor;
	
}
