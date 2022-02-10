package com.app.server.tcambio.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.app.server.tcambio.bean.Tarifario;
import com.app.server.tcambio.dto.TipoCambioInputDto;
import com.app.server.tcambio.dto.TipoCambioOutputDto;
import com.app.server.tcambio.service.TipoCambioService;
@Service
public class TipoCambioServiceImpl implements TipoCambioService {

	@Autowired
    RestTemplate restTemplate;

	@Override
	public TipoCambioOutputDto getTipoCambioOutputDto(TipoCambioInputDto tipoCambioInputDto) {
		TipoCambioOutputDto tipoCambioOutputDto= new TipoCambioOutputDto();
		String codigo = tipoCambioInputDto.getMonedaOrigen().concat(tipoCambioInputDto.getMonedaDestino());
 	    Tarifario tarifario=restTemplate.getForObject("http://localhost:61388/tarifario/" + codigo, Tarifario.class);
		tipoCambioOutputDto.setMontoTipoCambio(tarifario.getFactor().multiply(tipoCambioInputDto.getMonto()));
		tipoCambioOutputDto.setMonedaDestino(tipoCambioInputDto.getMonedaDestino());
		tipoCambioOutputDto.setMonedaOrigen(tipoCambioInputDto.getMonedaOrigen());
		tipoCambioOutputDto.setTipoCambio(tarifario.getFactor());
		//tipoCambioOutputDto.setMonto(tipoCambioInputDto.getMonto());
		return tipoCambioOutputDto;
	}
}
