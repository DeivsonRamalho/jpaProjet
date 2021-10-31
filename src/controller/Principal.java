package controller;

import dao.ContaDao;
import dao.impl.ContaDaoImpl;
import model.Conta;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*EntityManager em = JpaUtil.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.close();*/
		
		
		ContaDao contaDao = new ContaDaoImpl();
		Conta conta = new Conta();
		conta.setNumero(1095);
		conta.setSaldo(100000);
		conta.setLimite(154);
		contaDao.salvar(conta);
		
		
	}

}
