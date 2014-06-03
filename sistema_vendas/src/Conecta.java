import org.hibernate.Session;

import com.studiod.sistema.vendas.hibernate.HibernateUtil;


public class Conecta {

	public static void main(String[] args) {
		Session sessao = null;
		
		try {
			sessao = HibernateUtil.getSessionFactory().openSession();
			System.out.println("Conectado com sucesso!");
		} finally{
			sessao.close();
			System.out.println("A sessão foi fechada com sucesso!");
		}
	}
	
}
