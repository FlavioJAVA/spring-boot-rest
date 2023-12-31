package br.com.api;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaudacaoController {

	private static final String template = "Olá, %s!";
	private static final AtomicLong contador = new AtomicLong();
	
	@RequestMapping("/saudacao")
	public Saudacao saudacao(@RequestParam(value="nome", defaultValue = "mundo") String nome) {
		return new Saudacao(contador.incrementAndGet(), String.format(template, nome));
	}
	
}