package com.univ.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HBSessionUtil 
{
	private static SessionFactory sessionFactory;
	static
	{
		try 
		{
			sessionFactory =new Configuration().configure().buildSessionFactory();
		}
			catch(Throwable th)
			{
				System.err.println("Entital SessionFactory creation failed"+th);
				throw new ExceptionInInitializerError(th);
			}	
		}
		public static SessionFactory getSessionFactory()
		{
			return sessionFactory;
		}
	}

