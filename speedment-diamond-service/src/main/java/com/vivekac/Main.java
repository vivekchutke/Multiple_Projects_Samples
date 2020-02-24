package com.vivekac;

import com.speedment.enterprise.application.InMemoryBundle;
import com.speedment.enterprise.datastore.runtime.DataStoreComponent;
import com.speedment.enterprise.plugins.json.JsonBundle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    
    public static void main(final String... args) {
     
        SpringApplication.run(Main.class, args);
        
    }
}