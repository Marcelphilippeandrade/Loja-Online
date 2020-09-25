package br.com.lojaonline.beans;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

import br.com.lojaonline.daos.LivroDao;
import br.com.lojaonline.models.Livro;

@Model
public class AdminListaLivrosBean {

	@Inject
	private LivroDao dao;
	
	private List<Livro> livros = new ArrayList<>();
	
	public List<Livro> getLivros() {
		this.livros = dao.listar();
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}
}
