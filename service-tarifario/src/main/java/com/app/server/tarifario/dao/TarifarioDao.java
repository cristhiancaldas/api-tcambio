package com.app.server.tarifario.dao;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.app.server.tarifario.model.Tarifario;

import reactor.core.publisher.Mono;

public interface TarifarioDao extends ReactiveCrudRepository<Tarifario, Long>{
	Mono<Tarifario> findByOrigenAndDestino(String origen, String destino);
	Mono<Tarifario> findByCodigo(String codigo);
}
