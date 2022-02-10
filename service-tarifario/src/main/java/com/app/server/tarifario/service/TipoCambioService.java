package com.app.server.tarifario.service;

import com.app.server.tarifario.dto.RequestTipoCambioDto;
import com.app.server.tarifario.dto.ResponseTipoCambioDto;

import reactor.core.publisher.Mono;

public interface TipoCambioService {
	Mono<ResponseTipoCambioDto> getTipoCambio(RequestTipoCambioDto requestTipoCambioDto);
}
