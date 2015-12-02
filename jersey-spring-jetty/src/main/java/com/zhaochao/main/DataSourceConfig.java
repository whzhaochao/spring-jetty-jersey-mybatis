package com.zhaochao.main;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.apache.tomcat.jdbc.pool.PoolProperties;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceConfig {
	@Bean(autowire = Autowire.BY_TYPE)
	public DataSource dataSource() {
		PoolProperties poolProperties = new PoolProperties();
		poolProperties.setDriverClassName("com.mysql.jdbc.Driver");
		poolProperties.setUrl("jdbc:mysql://121.40.50.112:3306/zjol_vote_db?useUnicode=true&amp;characterEncoding=utf-8&amp;autoReconnect=true&amp;failOverReadOnly=false&amp;maxReconnects=10");
		poolProperties.setUsername("root");
		poolProperties.setPassword("wh5268925");
		poolProperties.setJmxEnabled(true);
		poolProperties.setJdbcInterceptors("org.apache.tomcat.jdbc.pool.interceptor.ConnectionState;org.apache.tomcat.jdbc.pool.interceptor.StatementFinalizer");
		poolProperties.setRemoveAbandonedTimeout(60);
		poolProperties.setRemoveAbandoned(true);
		poolProperties.setLogAbandoned(false);
		poolProperties.setMinIdle(10);
		poolProperties.setMinEvictableIdleTimeMillis(30000);
		poolProperties.setMaxWait(10);
		poolProperties.setInitialSize(2);
		poolProperties.setMaxActive(10);
		poolProperties.setTimeBetweenEvictionRunsMillis(30000);
		poolProperties.setValidationQuery("SELECT 1");
		poolProperties.setValidationInterval(30000);
		poolProperties.setTestOnReturn(false);
		poolProperties.setTestOnBorrow(true);
		poolProperties.setTestWhileIdle(true);
		poolProperties.setJmxEnabled(true);
		DataSource dataSource = new DataSource();
		dataSource.setPoolProperties(poolProperties);
		return dataSource;
	}
}
