package br.com.lojaonline.resource;

import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.annotations.providers.jaxb.Wrapped;

import br.com.lojaonline.daos.LivroDao;
import br.com.lojaonline.models.Livro;

@Path("livros")
public class LivroResource {

	@Inject
	private LivroDao dao;

	@GET
	@Path("lancamentos")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Wrapped(element = "livros")
	public List<Livro> ultimosLancamentos() {
		return dao.ultimosLancamentos();
	}
}
