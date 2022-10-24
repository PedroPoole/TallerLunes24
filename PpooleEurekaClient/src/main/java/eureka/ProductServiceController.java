package eureka;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class ProductServiceController {
	@Value("${server.port}")
	String puerto;

	//Endpoint GET que retorna el puerto en el que corre la aplicacion.
	@GetMapping("/port")
	public String retornarPuerto() {

		return puerto;
	}
}
