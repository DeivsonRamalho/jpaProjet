package dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import dao.ContaDao;
import model.Conta;
import model.JpaUtil;

public class ContaDaoImpl implements ContaDao {

	private EntityManager em;
	private EntityTransaction et;
	private JpaUtil JpaUtil = new JpaUtil();

	@Override
	public void salvar(Conta conta) {
		try {
			this.em = JpaUtil.getEntityManager();
			et = em.getTransaction();
			et.begin();
			em.persist(conta);
			et.commit();
		} catch (Exception e) {
			if (em.isOpen()) {
				et.rollback();
			}
			System.out.println("Erro Transacao");
		} finally {
			if (em.isOpen()) {
				em.clear();
			}
		}

	}

	@Override
	public void alterar(Conta conta) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remover(int numero) {
		// TODO Auto-generated method stub

	}

	@Override
	public Conta pesquisar(int numero) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Conta> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}
}
