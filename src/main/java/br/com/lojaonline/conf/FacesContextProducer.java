package br.com.lojaonline.conf;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.faces.context.FacesContext;

public class FacesContextProducer {

	@RequestScoped
	@Produces
	public FacesContext getFecesContext() {
		return FacesContext.getCurrentInstance();
	}
}
