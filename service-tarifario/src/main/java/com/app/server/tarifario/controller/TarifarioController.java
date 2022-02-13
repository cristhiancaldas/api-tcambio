
package com.app.server.tarifario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.server.tarifario.dto.RequestTipoCambioDto;
import com.app.server.tarifario.dto.ResponseTipoCambioDto;
import com.app.server.tarifario.model.Tarifario;
import com.app.server.tarifario.service.TarifarioService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/tarifario")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class TarifarioController {

	@Autowired
	TarifarioService tarifarioService;
	
	@GetMapping
	public Flux<Tarifario> getAllListTarifarios() {
		return tarifarioService.listarTarifario();
	}
	
	@GetMapping("/{codigo}")
	public Mono<Tarifario> getTarifario(@PathVariable String codigo) {
		return tarifarioService.getTarifario(codigo);
	}
	
	@PostMapping
	public Mono<Tarifario> addTarifario(@RequestBody Tarifario tarifario) {
		return tarifarioService.addTarifario(tarifario);
	}

	@PutMapping("/{id}")
	public Mono<Tarifario> updateTarifario(@PathVariable Long id,@RequestBody Tarifario tarifario) {
		return tarifarioService.updateTarifario(id,tarifario);
	}

	@PostMapping("/tipocambio")
	public Mono<ResponseTipoCambioDto> getTipoCambio(@RequestBody RequestTipoCambioDto requestTipoCambioDto) {
		return tarifarioService.getTipoCambio(requestTipoCambioDto);
	}

}
