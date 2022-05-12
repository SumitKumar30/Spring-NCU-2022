package org.ncu.spring_aop_demo;

import org.ncu.spring_aop_demo.entity.Account;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass=true)
@ComponentScan("org.ncu.spring_aop_demo")
public class DemoConfig {
	@Bean("accountBean")
	public Account getAccount() {
		return new Account();
	}
}
