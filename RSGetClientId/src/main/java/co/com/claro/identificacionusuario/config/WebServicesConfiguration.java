package co.com.claro.identificacionusuario.config;

import co.com.claro.identificacionusuario.domain.RetrieveCustomerDataService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class WebServicesConfiguration {

    @Value("${webservice.wsAccountManagement.url}")
    private String wsUri;

    @Bean(name = "customerData")
    public Jaxb2Marshaller customerData() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("co.com.claro.identificacionusuario.generated");
        return marshaller;
    }

    @Bean
    public RetrieveCustomerDataService retrieveCustomerDataService(@Qualifier("customerData") Jaxb2Marshaller marshaller) {
        RetrieveCustomerDataService retrieveCustomerDataService = new RetrieveCustomerDataService();
        retrieveCustomerDataService.setDefaultUri(wsUri);
        retrieveCustomerDataService.setMarshaller(marshaller);
        retrieveCustomerDataService.setUnmarshaller(marshaller);
        return retrieveCustomerDataService;
    }

}
