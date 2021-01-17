package br.com.lojaonline.beans;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

import br.com.lojaonline.models.Promo;
import br.com.lojaonline.websockets.PromosEndPoint;

@Model
public class AdminPromosBean {

	private Promo promo = new Promo();

	@Inject
	private PromosEndPoint promos;

	public void enviar() {
		promos.send(promo);
	}

	public Promo getPromo() {
		return promo;
	}

	public void setPromo(Promo promo) {
		this.promo = promo;
	}

}
