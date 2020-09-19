package br.com.lojaonline.beans;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;
import br.com.lojaonline.daos.AutorDao;
import br.com.lojaonline.daos.LivroDao;
import br.com.lojaonline.models.Autor;
import br.com.lojaonline.models.Livro;

@Named
@RequestScoped
public class AdminLivrosBean {

	private Livro livro = new Livro();

	private List<Integer> autoresId = new ArrayList<>();

	@Inject
	private LivroDao dao;

	@Inject
	private AutorDao autorDao;

	@Transactional
	public void salvar() {

		for (Integer autorId : autoresId) {
			livro.getAutores().add(new Autor(autorId));
		}

		dao.salvar(livro);
		System.out.println("Livro Cadastrado: " + livro);
		this.livro = new Livro();
		this.autoresId = new ArrayList<Integer>();
	}

	public List<Autor> getAutores() {
		return autorDao.listar();
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public List<Integer> getAutoresId() {
		return autoresId;
	}

	public void setAutoresId(List<Integer> autoresId) {
		this.autoresId = autoresId;
	}
}
