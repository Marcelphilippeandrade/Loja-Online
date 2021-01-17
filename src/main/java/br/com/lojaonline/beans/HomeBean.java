package br.com.lojaonline.beans;

import java.util.List;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import br.com.lojaonline.daos.LivroDao;
import br.com.lojaonline.models.Livro;

@Model
public class HomeBean {

	@Inject
	private LivroDao dao;

	public List<Livro> ultimosLancamentos() {
		System.out.println("Entrando nos ultimos lancamentos");
		return dao.ultimosLancamentos();
	}
	
	public List<Livro> demaisLivros(){
		System.out.println("Entrando nos demais livros");
		return dao.demaisLivros();
	}
}
