package org.ics.profile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Hello world!
 *
 */
@Component("app")
public class App {
    @Value("${app.environment}")
    private String environment;

    /**
     * @return the environment
     */
    public String getEnvironment() {
        return environment;
    }

    /**
     * @param environment the environment to set
     */
    public void setEnvironment(String environment) {
        this.environment = environment;
    }
    
}
