package co.com.claro.identificacionusuario.dto;

import co.com.claro.identificacionusuario.application.IClientDataApplication;

/**
 * Objecto Dto que contiene la respuesta del método calloptService de la interfaz {@link IClientDataApplication}
 * contiene los atributos siguientes atributos:
 * responseCode - descripción del codigo http
 * IsPresent - atributo tipo boolean
 * NumeroIdentificacion - numero de identificación del cliente
 * TipoIdentificacion - tipo de identificación del cliente
 *
 * @author Fabrica Digital Microservicios
 * @versión 0.0.1-SNAPSHOT
 */
public class DataDto {
	private boolean isPresent;
    private Long numeroIdentificacion;
    private Long tipoIdentificacion;
    
	public DataDto(boolean isPresent, Long numeroIdentificacion, Long tipoIdentificacion) {
		super();
		this.isPresent = isPresent;
		this.numeroIdentificacion = numeroIdentificacion;
		this.tipoIdentificacion = tipoIdentificacion;
	}

	public boolean isIsPresent() {
		return isPresent;
	}

	public void setIsPresent(boolean isPresent) {
		this.isPresent = isPresent;
	}

	public Long getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	public void setNumeroIdentificacion(Long numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}

	public Long getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	public void setTipoIdentificacion(Long tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}
}
