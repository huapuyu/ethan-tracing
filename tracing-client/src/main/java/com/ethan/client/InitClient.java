package com.ethan.client;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
// public class Init implements InitializingBean,
// ApplicationListener<ContextRefreshedEvent> {
public class InitClient {

	// @Override
	// public void afterPropertiesSet() throws Exception {
	// }

	@PostConstruct
	public void init() {
	}

	// @Override
	// public void onApplicationEvent(ContextRefreshedEvent event) {
	// }
}
