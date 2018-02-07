package com.stallapp.car.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.stallapp.car.index.config.CarIndexConfig;
import com.stallapp.car.index.config.CarIndexConfigImpl;
import com.stallapp.mongodb.framework.spring.config.JMongodbSpringConfig;

@Import(JMongodbSpringConfig.class)
@Configuration
@ComponentScan(basePackages = "com.stallapp")
//@PropertySource("classpath:application.properties")
public class ApplicationConfig {

	@Bean
	public CarIndexConfig carIndexConfig() {
		return new CarIndexConfigImpl();
	}

	/*@Bean
	public static PropertySourcesPlaceholderConfigurer placeHolderConfigurer() {
		PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
		YamlPropertiesFactoryBean yaml = new YamlPropertiesFactoryBean();
		yaml.setResources(new ClassPathResource("application.yml"));
		propertySourcesPlaceholderConfigurer.setProperties(yaml.getObject());
		return propertySourcesPlaceholderConfigurer;
	}*/

}
