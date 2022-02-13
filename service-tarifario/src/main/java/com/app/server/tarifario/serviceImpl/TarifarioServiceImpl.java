package com.app.server.tarifario.serviceImpl;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.server.tarifario.dao.TarifarioDao;
import com.app.server.tarifario.dto.RequestTipoCambioDto;
import com.app.server.tarifario.dto.ResponseTipoCambioDto;
import com.app.server.tarifario.model.Tarifario;
import com.app.server.tarifario.service.TarifarioService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TarifarioServiceImpl implements TarifarioService {

	@Autowired
	TarifarioDao tarifarioDao;

	@Override
	public Flux<Tarifario> listarTarifario() {
		return tarifarioDao.findAll();
	}

	@Override
	public Mono<Tarifario> addTarifario(Tarifario tarifario) {
		tarifario.setCodigo(tarifario.getOrigen().concat(tarifario.getDestino()));
		return tarifarioDao.save(tarifario);
	}

	@Override
	public Mono<Tarifario> getTarifario(String codigo) {
		return tarifarioDao.findByCodigo(codigo);
	}

	@Override
	public Mono<Tarifario> updateTarifario(Long id, Tarifario tarifario) {
		return tarifarioDao.findById(id).flatMap(tarifa -> {
			tarifario.setId(id);
			return tarifarioDao.save(tarifario);
		}).switchIfEmpty(Mono.empty());
	}

	@Override
	public Mono<ResponseTipoCambioDto> getTipoCambio(RequestTipoCambioDto requestTipoCambioDto) {
		String codigo = (requestTipoCambioDto.getMonedaOrigen().concat(requestTipoCambioDto.getMonedaDestino()));
		return tarifarioDao.findByCodigo(codigo).map((p) -> obtenerTotal(p, requestTipoCambioDto));

	}

	private ResponseTipoCambioDto obtenerTotal(Tarifario tarifario, RequestTipoCambioDto tipoCambioInputDto) {
		ResponseTipoCambioDto tipoCambioOutputDto = new ResponseTipoCambioDto();
		tipoCambioOutputDto.setMonedaOrigen(tipoCambioInputDto.getMonedaOrigen());
		tipoCambioOutputDto.setMonedaDestino(tipoCambioInputDto.getMonedaDestino());
		tipoCambioOutputDto.setTipoCambio(tarifario.getFactor());
		tipoCambioOutputDto.setMontoTipoCambio(tipoCambioInputDto.getMonto().multiply(tarifario.getFactor()));

		return tipoCambioOutputDto;
	}
}
