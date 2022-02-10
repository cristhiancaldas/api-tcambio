package com.app.server.tarifario.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.server.tarifario.dao.TipoCambioDao;
import com.app.server.tarifario.dto.RequestTipoCambioDto;
import com.app.server.tarifario.dto.ResponseTipoCambioDto;
import com.app.server.tarifario.service.TipoCambioService;

import reactor.core.publisher.Mono;

public class TipoCambioServiceImpl implements TipoCambioService{

	@Autowired
	TipoCambioDao tipoCambioDao;
	
	@Override
	public Mono<ResponseTipoCambioDto> getTipoCambio(RequestTipoCambioDto requestTipoCambioDto) {
		String codigo=(requestTipoCambioDto.getMonedaOrigen().concat(requestTipoCambioDto.getMonedaDestino()));
		
		return tipoCambioDao.findByCodigo(codigo).map(
				tarifario->{
					ResponseTipoCambioDto responseTipoCambioDto=null;
					responseTipoCambioDto.setTipoCambio(tarifario.getFactor());
					responseTipoCambioDto.setMonedaDestino(tarifario.getDestino());
					responseTipoCambioDto.setMonedaOrigen(tarifario.getOrigen());
					responseTipoCambioDto.setMontoTipoCambio(tarifario.getFactor().multiply(requestTipoCambioDto.getMonto()));
					 return responseTipoCambioDto;
				});

	}

}
