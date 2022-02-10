package com.app.server.tarifario.service;

import com.app.server.tarifario.model.Tarifario;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TarifarioService {
	Mono<Tarifario> addTarifario(Tarifario tarifario);
	Flux<Tarifario> listarTarifario();
	Mono<Tarifario> getTarifario(String codigo);
}
