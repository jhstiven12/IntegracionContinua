package co.com.claro.identificacionusuario.domain;

import co.com.claro.identificacionusuario.exceptions.CallLegacyException;
import co.com.claro.identificacionusuario.exceptions.FallbackMethodException;
import co.com.claro.identificacionusuario.generated.RetrieveCustomerDataResponseType;
import co.com.claro.identificacionusuario.exceptions.*;

/**
 * Interfaz de integración con legado AccountManagement_PS.getRetriveCustomerData
 * contiene método que integra con legado AccountManagement_PS.getRetriveCustomerData
 *
 * @author Fabrica Digital Microservicios
 * @versión 0.0.1-SNAPSHOT
 */
public interface IRetrieveCustomerDataService {

    /**
     * Método service que contiene la integración con legado AccountManagement_PS.getRetriveCustomerData
     * método de integración SOAP con legado AccountManagement_PS.getRetriveCustomerData
     *
     * @author Fabrica Digital Microservicios
     * @param lineofBusiness atributo de tipo string
     * @param min número telefónico del cliente de tipo String
     * @return {@link RetrieveCustomerDataResponseType retrieveCustomerDataResponseType}
     * @throws CallLegacyException {@link CallLegacyException}
     * @throws FallbackMethodException {@link FallbackMethodException}
     *
     */
    public RetrieveCustomerDataResponseType getRetriveCustomerData(String lineofBusiness, Long min);

}
