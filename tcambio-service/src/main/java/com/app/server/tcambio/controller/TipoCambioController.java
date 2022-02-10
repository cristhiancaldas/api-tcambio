package com.app.server.tcambio.controller;

import java.util.HashMap;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.server.tcambio.dto.TipoCambioInputDto;
import com.app.server.tcambio.dto.TipoCambioOutputDto;
import com.app.server.tcambio.service.TipoCambioService;

@RestController
@RequestMapping("/tipo-cambio")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class TipoCambioController {

	@Autowired
	TipoCambioService tipoCambioService;
	
//	@GetMapping
//	public Mono<TipoCambioOutputDto> aplicarTipoCambio(@Valid @ModelAttribute TipoCambioInputDto tipoCambioInputDto) {
//		return tipoCambioService.aplicaTipoCambio(tipoCambioInputDto);
//	}
	@GetMapping
	public TipoCambioOutputDto aplicarTipoCambio(@Valid @ModelAttribute TipoCambioInputDto tipoCambioInputDto) {
		return tipoCambioService.getTipoCambioOutputDto(tipoCambioInputDto);
	}
	
	@GetMapping("/v1")
	public HashMap<String, Object> aplicar() {
		 HashMap<String, Object> map = new HashMap<>();
		    map.put("key1", "value1");
		    map.put("results", "pruebe");
		    return map;
	}
}
