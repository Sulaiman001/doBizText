package com.abuabdul.dobiztext.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author abuabdul
 *
 */
@Configuration
@Profile("prod")
public class PersistentDataSourceConfig extends AbstractDataSourceConfig {

	@Override
	protected String getSQLDBUrl() {
		return new StringBuilder("jdbc:mysql://").append(getHost()).append(":").append(getPort()).append("/")
				.append(getDBName()).toString();
	}

	protected String getHost() {
		return this.host;
	}

	protected String getPort() {
		return this.port;
	}

	@Override
	protected String getDBDialect() {
		return this.dbDialect;
	}

	@Override
	protected String getDriverClassName() {
		return this.driverClassName;
	}

	@Override
	protected String getUsername() {
		return this.username;
	}

	@Override
	protected String getPassword() {
		return this.password;
	}
}
