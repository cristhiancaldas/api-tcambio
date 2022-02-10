package com.app.server.tcambio.service;

import com.app.server.tcambio.dto.TipoCambioInputDto;
import com.app.server.tcambio.dto.TipoCambioOutputDto;

import reactor.core.publisher.Mono;

public interface TipoCambioService {
	//Mono<TipoCambioOutputDto> aplicaTipoCambio(TipoCambioInputDto tipoCambioInputDto);
	public TipoCambioOutputDto getTipoCambioOutputDto(TipoCambioInputDto tipoCambioInputDto);
}
