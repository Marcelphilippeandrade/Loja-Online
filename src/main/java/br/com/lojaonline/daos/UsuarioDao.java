package br.com.lojaonline.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.lojaonline.models.Usuario;

public class UsuarioDao {

	@PersistenceContext
	private EntityManager manager;

	public void salvar(Usuario usuario) {
		manager.persist(usuario);
	}
}
