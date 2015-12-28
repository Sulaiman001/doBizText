package com.abuabdul.dobiztext.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaDialect;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

/**
 * @author abuabdul
 *
 */
public abstract class AbstractDataSourceConfig {

	@Value("${dobiztext.db.name}")
	protected String dbName;

	@Value("${dobiztext.db.dialect}")
	protected String dbDialect;

	@Value("${dobiztext.inmemory.db.dialect}")
	protected String dbDialectInMem;

	@Value("${dobiztext.domain.packages.to.scan}")
	protected String packagesToScan;

	@Value("${dobiztext.db.script.classpath.location}")
	protected String dbScript;

	@Value("${dobiztext.jdbc.driverClassName}")
	protected String driverClassName;

	@Value("${dobiztext.jdbc.inmemory.driverClassName}")
	protected String driverClassNameInMem;

	@Value("${dobiztext.inmemory.username}")
	protected String usernameInMem;

	@Value("${dobiztext.inmemory.password}")
	protected String passwordInMem;

	@Value("${OPENSHIFT_MYSQL_DB_HOST}")
	protected String host;

	@Value("${OPENSHIFT_MYSQL_DB_PORT}")
	protected String port;

	@Value("${OPENSHIFT_MYSQL_DB_USERNAME}")
	protected String username;

	@Value("${OPENSHIFT_MYSQL_DB_PASSWORD}")
	protected String password;

	@Value("${jdbc.poolInitialSize}")
	protected int initialSize;

	@Value("${jdbc.poolMaxTotal}")
	protected int maxTotal;

	@Value("${jdbc.poolMinIdle}")
	protected int minIdle;

	@Value("${jdbc.poolMaxIdle}")
	protected int maxIdle;

	@Value("${jdbc.poolMaxWaitMillis}")
	protected int maxWaitMillis;

	@Bean(destroyMethod = "close")
	protected DataSource dataSource() {
		BasicDataSource datasource = new BasicDataSource();
		datasource.setDriverClassName(getDriverClassName());
		datasource.setUrl(getSQLDBUrl());
		datasource.setUsername(getUsername());
		datasource.setPassword(getPassword());
		datasource.setInitialSize(initialSize);
		datasource.setMinIdle(minIdle);
		datasource.setMaxIdle(maxIdle);
		datasource.setMaxTotal(maxTotal);
		datasource.setMaxWaitMillis(maxWaitMillis);
		return datasource;
	}

	@Bean
	protected LocalContainerEntityManagerFactoryBean entityManagerFactoryBean() {
		LocalContainerEntityManagerFactoryBean entityManagerFactory = new LocalContainerEntityManagerFactoryBean();
		entityManagerFactory.setDataSource(dataSource());
		entityManagerFactory.setJpaDialect(new HibernateJpaDialect());
		entityManagerFactory.setPersistenceProvider(new HibernatePersistenceProvider());
		entityManagerFactory.setJpaVendorAdapter(jpaVendorAdapter());
		entityManagerFactory.setPackagesToScan(packagesToScan);
		return entityManagerFactory;
	}

	@Bean
	protected JpaVendorAdapter jpaVendorAdapter() {
		HibernateJpaVendorAdapter hibernateJpaVendorAdapter = new HibernateJpaVendorAdapter();
		hibernateJpaVendorAdapter.setDatabasePlatform(getDBDialect());
		hibernateJpaVendorAdapter.setGenerateDdl(false);
		hibernateJpaVendorAdapter.setShowSql(true);
		return hibernateJpaVendorAdapter;
	}

	@Bean(name = "transactionManager")
	public PlatformTransactionManager jpaTransactionManager() {
		JpaTransactionManager jpaTransactionManager = new JpaTransactionManager();
		jpaTransactionManager.setEntityManagerFactory(entityManagerFactoryBean().getObject());
		return jpaTransactionManager;
	}

	abstract protected String getDriverClassName();

	abstract protected String getSQLDBUrl();

	abstract protected String getUsername();

	abstract protected String getPassword();

	abstract protected String getDBDialect();

	protected String getDBName() {
		return this.dbName;
	}

	protected String getDBScript() {
		return this.dbScript;
	}
}
