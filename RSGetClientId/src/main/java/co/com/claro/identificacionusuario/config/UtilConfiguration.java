package co.com.claro.identificacionusuario.config;

import com.google.gson.Gson;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UtilConfiguration {

    @Bean
    public Gson gson() {
        return new Gson();
    }
}
