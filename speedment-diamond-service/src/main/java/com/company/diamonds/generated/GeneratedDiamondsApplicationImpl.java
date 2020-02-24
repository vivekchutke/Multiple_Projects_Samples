package com.company.diamonds.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.enterprise.datastore.runtime.DataStoreComponent;
import com.speedment.runtime.application.AbstractSpeedment;

import javax.annotation.PostConstruct;

/**
 * The generated {@link
 * com.speedment.runtime.application.AbstractApplicationBuilder} implementation
 * class for the {@link com.speedment.runtime.config.Project} named diamonds.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public class GeneratedDiamondsApplicationImpl 
extends AbstractSpeedment 
implements GeneratedDiamondsApplication {
    
    @PostConstruct
    public void populateCache() {
        getOrThrow(DataStoreComponent.class).load();
    }
}