package com.sbnz.berza;

import org.springframework.context.annotation.Bean;
import org.kie.api.KieServices;
import org.kie.api.builder.KieScanner;
import org.kie.api.runtime.KieContainer;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	@Bean
	public KieContainer kieContainer() {
		KieServices ks = KieServices.Factory.get();
		KieContainer kContainer = ks
				.newKieContainer(ks.newReleaseId("com.sbnz", "drools-spring-v2-kjar", "0.0.1-SNAPSHOT"));
		
		KieScanner kScanner = ks.newKieScanner(kContainer);

		kScanner.start(10000);
		return kContainer;
	}
}

