package com.jth.spring.shop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.jth.spring.shop.Cashier;

@Configuration
@Profile("global")
@ComponentScan("com.jth.spring.shop")
public class ShopConfigurationGlobal {
	
	@Bean(initMethod = "openFile", destroyMethod = "closeFile")
	public Cashier cashier() {
		final String path = System.getProperty("java.io.tmpdir") + "cashier";
		Cashier c1 = new Cashier();
		c1.setFileName("checkout");
		c1.setPath(path);
		return c1;
	}

}
