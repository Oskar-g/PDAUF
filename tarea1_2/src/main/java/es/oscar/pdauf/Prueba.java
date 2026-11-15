package es.oscar.pdauf;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Prueba {

	@GetMapping
	public String get() {
		return "funciona";
	}
}
