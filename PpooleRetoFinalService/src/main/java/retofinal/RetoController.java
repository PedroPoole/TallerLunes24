package retofinal;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class RetoController {
	@Value("${creador.nombre}")
	String nombreCreador;

	
	//Endpoint GET que retorna el nombre del creador de la aplicación
	@GetMapping("/nombre")
	public String dameNombre() {
		return nombreCreador;
	}
}
