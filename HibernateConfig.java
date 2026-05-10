package com.pms.app;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfig {
	 private static SessionFactory sf;

	    static {

	        Configuration cfg = new Configuration();
	        cfg.configure();

	        sf = cfg.buildSessionFactory();

	    }

	    public static SessionFactory getSessionFactory() {
	        return sf;
	    }

}
