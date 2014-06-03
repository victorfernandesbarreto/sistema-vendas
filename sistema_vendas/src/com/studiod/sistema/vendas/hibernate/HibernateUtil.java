package com.studiod.sistema.vendas.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static final SessionFactory session = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try {
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			return cfg.buildSessionFactory();
		} catch (Throwable e) {
			System.out.println("Problema ao conectar com o banco: "+e);
			throw new ExceptionInInitializerError();
		}
	}
	
	public static SessionFactory getSessionFactory(){
		return session;
	}

}
