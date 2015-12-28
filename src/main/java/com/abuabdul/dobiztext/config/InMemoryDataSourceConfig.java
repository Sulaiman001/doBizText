package com.abuabdul.dobiztext.config;

import org.hsqldb.util.DatabaseManagerSwing;
import org.springframework.beans.factory.config.MethodInvokingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import com.abuabdul.dobiztext.exception.DoBizTextException;

/**
 * @author abuabdul
 *
 */
@Configuration
@Profile("dev")
public class InMemoryDataSourceConfig extends AbstractDataSourceConfig {

	@Bean
	public EmbeddedDatabase embeddedDatabase() {
		return new EmbeddedDatabaseBuilder().setName(getDBName()).setType(EmbeddedDatabaseType.HSQL)
				.addScript(getDBScript()).build();
	}

	// @PostConstruct
	public void startDBManager() throws DoBizTextException {
		try {
			MethodInvokingBean methodInvokingBean = new MethodInvokingBean();
			methodInvokingBean.setTargetClass(DatabaseManagerSwing.class);
			methodInvokingBean.setTargetMethod("main");
			methodInvokingBean.setArguments(
					new String[] { "--url", getSQLDBUrl(), "--user", getUsername(), "--password", getPassword() });
			methodInvokingBean.prepare();
			methodInvokingBean.invoke();
		} catch (Exception ex) {
			throw new DoBizTextException(ex.getMessage(), ex);
		}
	}

	@Override
	protected String getSQLDBUrl() {
		return new StringBuilder("jdbc:hsqldb:mem:").append(getDBName()).toString();
	}

	@Override
	protected String getDBDialect() {
		return this.dbDialectInMem;
	}

	@Override
	protected String getDriverClassName() {
		return this.driverClassNameInMem;
	}

	@Override
	protected String getUsername() {
		return this.usernameInMem;
	}

	@Override
	protected String getPassword() {
		return this.passwordInMem;
	}
}
