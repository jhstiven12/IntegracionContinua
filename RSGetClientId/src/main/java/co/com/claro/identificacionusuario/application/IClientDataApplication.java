package co.com.claro.identificacionusuario.application;

import co.com.claro.identificacionusuario.dto.DataDto;
import co.com.claro.identificacionusuario.exceptions.CallLegacyException;
import co.com.claro.identificacionusuario.exceptions.FallbackMethodException;
import co.com.claro.identificacionusuario.generated.RetrieveCustomerDataResponseType;
import co.com.claro.identificacionusuario.domain.IRetrieveCustomerDataService;

/**
 * Interfaz service que comunica con service
 * {@link IRetrieveCustomerDataService}
 *
 * @author Fabrica Digital Microservicios
 * @versión 0.0.1-SNAPSHOT
 */
public interface IClientDataApplication {

	/**
	 * Método service que comunica con service {@link IRetrieveCustomerDataService}
	 *
	 * @author Fabrica Digital Microservicios
	 * @param min número telefónico del cliente de tipo String
	 * @return {@link RetrieveCustomerDataResponseType
	 *         retrieveCustomerDataResponseType}
	 * @throws CallLegacyException     {@link CallLegacyException}
	 * @throws FallbackMethodException {@link FallbackMethodException}
	 *
	 */
	public DataDto getData(String min);

}
