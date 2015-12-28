package com.abuabdul.dobiztext.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

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
