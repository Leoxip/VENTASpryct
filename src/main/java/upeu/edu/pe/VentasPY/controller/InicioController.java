package upeu.edu.pe.VentasPY.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InicioController {

	@GetMapping("/")
	public String index() {
	return "Bienvenidos a Ventas";
	}
}