package br.com.brendoniwata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@EnableFeignClients
@Controller
public class FeignPerEnviromentApplication {

	@Autowired
	private Environment environment;

	@Autowired
	private BrendonClient client;

	public static void main(String[] args) {
		SpringApplication.run(FeignPerEnviromentApplication.class, args);
	}

	public void metodo () {
		String name = environment.getProperty("feign.name");
	}

	@GetMapping("/teste")
	public void testar () {
		String html = client.getPokemon();
	}

}
