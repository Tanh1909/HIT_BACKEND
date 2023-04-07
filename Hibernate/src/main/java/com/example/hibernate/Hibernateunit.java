package com.example.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;

public class Hibernateunit {
    private static final SessionFactory factory;
    static {
        Configuration cf= new Configuration();
        Properties properties=new Properties();
        cf.setProperties(properties);
        properties.put(Environment.DIALECT,"org.hibernate.dialect.MYSQLDialect");
        properties.put(Environment.DRIVER,"com.mysql.jdbc.Driver");
        properties.put(Environment.URL,"jdbc:mysql://localhost/world");
        properties.put(Environment.USER,"root");
        properties.put(Environment.PASS,"12345678900");
        properties.put(Environment.SHOW_SQL,true);
        ServiceRegistry registry= new StandardServiceRegistryBuilder().applySettings(cf.getProperties()).build();
        factory=cf.buildSessionFactory(registry);

    }
    public static SessionFactory getFactory(){
        return factory;
    }
}
