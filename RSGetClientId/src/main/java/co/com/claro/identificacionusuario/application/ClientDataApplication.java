package co.com.claro.identificacionusuario.application;

import co.com.claro.identificacionusuario.config.UtilConfiguration;
import co.com.claro.identificacionusuario.constants.Constants;
import co.com.claro.identificacionusuario.domain.IRetrieveCustomerDataService;
import co.com.claro.identificacionusuario.exceptions.FallbackMethodException;
import co.com.claro.identificacionusuario.generated.RetrieveCustomerDataResponseType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.com.claro.identificacionusuario.dto.DataDto;

import org.springframework.util.StopWatch;

import com.google.gson.Gson;

import java.util.Objects;

@Service
public class ClientDataApplication implements IClientDataApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(ClientDataApplication.class);

	@Autowired
	private IRetrieveCustomerDataService wsclient;

	@Autowired
	private UtilConfiguration utilConfiguration;

	@Override
	public DataDto getData(String min) {
		String logerInfo = "";
		logerInfo = String.format(Constants.PROCESSING_PETITION_FOR_LINE, min);
		LOGGER.info(logerInfo);
		StopWatch stopWatch = new StopWatch();
		stopWatch.start("getRetriveCustomerData");
		RetrieveCustomerDataResponseType response = wsclient.getRetriveCustomerData("1", Long.parseLong(min));
		stopWatch.stop();
		logerInfo = String.format(Constants.TIME_CONSUMPTION_LEGACY, stopWatch.getTotalTimeSeconds());
		LOGGER.info(logerInfo);
		if (Objects.nonNull(response)) {
			logerInfo = new Gson().toJson(response);
			LOGGER.debug(logerInfo);
		}

		if (Objects.isNull(response)) {
			LOGGER.debug(null);
			throw new FallbackMethodException("Error timeout RetriveCustomerData");
		}

		if (response.getAcknowledgementIndicator().equals("SUCCESS"))
			return new DataDto(true, Long.parseLong(response.getCustomerData().getDocumentNumber()),
					Long.parseLong(response.getCustomerData().getDocumentType()));
		else
			return new DataDto(false, 0L, 0L);
	}

}
