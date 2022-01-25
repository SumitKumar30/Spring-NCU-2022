package org.ncu.coupling;

public class GreetingServiceFactory {
	public GreetingService getGreetingService(String lang) {
		if(lang.equals("English")) {
			return new EnglishGreetingService();
		}else {
			if(lang.equals("Spanish")) {
				return new SpanishGreetingService();
			}else if(lang.equals("French")){
				return new FrenchGreetingService();
			}else {
//				return new NoGreetingService();
				throw new RuntimeException("No greeting service exist for "+lang+" language");
			}
		}
	}
}
