package co.com.claro.identificacionusuario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"co.com.claro.filter.domain","co.com.claro.identificacionusuario.*"})
@RefreshScope
@SpringBootApplication
@EnableCircuitBreaker
@EnableHystrixDashboard
public class IdentificacionusuarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(IdentificacionusuarioApplication.class, args);
	}
}
