package com.zhaochao.main;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;
import com.zhaochao.action.HelloAction;


public class ApplicationConfig extends ResourceConfig {
    
    public ApplicationConfig() {
    	packages("com.zhaochao.action");
        register(JacksonFeature.class);
        //register(RequestContextFilter.class);  // Though it might be needed. Guess not
        property(ServerProperties.METAINF_SERVICES_LOOKUP_DISABLE, true);
    }
}
