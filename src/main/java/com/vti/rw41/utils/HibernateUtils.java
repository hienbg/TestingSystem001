package com.vti.rw41.utils;

import com.github.fluent.hibernate.cfg.scanner.EntityScanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtils {
    private static HibernateUtils instance;
    // This Constructor will auto loading configure
    private HibernateUtils() {
        configure();
    }

    private Configuration configuration;
    private SessionFactory sessionFactory;

    // This method is design pattern singleton to get Hibernate instance
    public static HibernateUtils getInstance() {
        if (null == instance) {
            instance = new HibernateUtils();
        }
        return instance;
    }
    private void configure() {
    // Load configuration
    configuration = new Configuration();
    configuration.configure("Hibernate.cfg.xml");

    // Auto Scan Entity
        EntityScanner.scanPackages("com.vti.rw41.entity").addTo(configuration);
    }

    private SessionFactory buildSessionFactory() {
        if (null == sessionFactory || sessionFactory.isClosed()) {
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties()).build();

            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        }
        return sessionFactory;
    }

    public void closeFactory() {
        if (null == sessionFactory && sessionFactory.isOpen()) {
            sessionFactory.close();
        }
    }

    public Session openSession() {
        buildSessionFactory();
        return sessionFactory.openSession();
    }
}
