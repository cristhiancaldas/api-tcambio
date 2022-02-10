package com.app.server.tarifario.dao;

import com.app.server.tarifario.model.Tarifario;

import reactor.core.publisher.Mono;

public interface TipoCambioDao {
	Mono<Tarifario> findByCodigo(String codigo);
}
