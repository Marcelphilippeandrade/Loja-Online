package br.com.lojaonline.beans;

import java.util.List;

import javax.enterprise.inject.Model;
import javax.inject.Inject;
import br.com.lojaonline.daos.LivroDao;
import br.com.lojaonline.models.CarrinhoCompras;
import br.com.lojaonline.models.CarrinhoItem;
import br.com.lojaonline.models.Livro;

@Model
public class CarrinhoComprasBean {

	@Inject
	private LivroDao livroDao;

	@Inject
	private CarrinhoCompras carrinho;

	public String add(Integer id) {
		Livro livro = livroDao.buscarPorId(id);
		CarrinhoItem item = new CarrinhoItem(livro);
		carrinho.add(item);
		return "carrinho?faces-redirect=true";
	}

	public List<CarrinhoItem> getItens() {
		return carrinho.getItens();
	}

	public void remover(CarrinhoItem item) {
		carrinho.remover(item);
	}
}
