package com.company.diamonds.generated;

import com.company.allergens.AllergensManager;
import com.company.diamonds.DiamondManager;
import com.company.diamonds.DiamondsApplication;
import com.company.diamonds.DiamondsApplicationBuilder;
import com.company.diamonds.diamonds.diamonds.hibernate_sequence.HibernateSequenceManager;
import com.company.mealse.MealseManager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.enterprise.datastore.runtime.DataStoreBundle;
import com.speedment.enterprise.datastore.runtime.DataStoreComponent;
import com.speedment.enterprise.plugins.json.JsonBundle;
import com.speedment.enterprise.plugins.json.JsonComponent;
import com.speedment.runtime.core.ApplicationBuilder;
import com.speedment.runtime.core.component.ProjectComponent;
import com.speedment.runtime.join.JoinBundle;
import com.speedment.runtime.join.JoinComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

/**
 * The spring configuration file
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public class GeneratedDiamondsConfiguration {
    
    protected static final String URL_PROPERTY = "spring.speedment.url";
    protected static final String HOST_PROPERTY = "spring.speedment.host";
    protected static final String PORT_PROPERTY = "spring.speedment.port";
    protected static final String USERNAME_PROPERTY = "spring.speedment.username";
    protected static final String PASSWORD_PROPERTY = "spring.speedment.password";
    protected static final String LOGGING_PROPERTY = "spring.speedment.logging";
    protected @Autowired Environment env;
    
    @Bean
    public DiamondsApplication getApplication() {
        return getApplicationBuilder().build();
    }
    
    public DiamondsApplicationBuilder getApplicationBuilder() {
        final DiamondsApplicationBuilder builder =
            new DiamondsApplicationBuilder()
                .withBundle(DataStoreBundle.class)
                .withBundle(JsonBundle.class)
                .withBundle(JoinBundle.class);
        
        if (env.containsProperty(URL_PROPERTY)) {
            builder.withConnectionUrl(env.getProperty(URL_PROPERTY));
        }
        
        if (env.containsProperty(HOST_PROPERTY)) {
            builder.withIpAddress(env.getProperty(HOST_PROPERTY));
        }
        
        if (env.containsProperty(PORT_PROPERTY)) {
            builder.withPort(Integer.parseInt(env.getProperty(PORT_PROPERTY)));
        }
        
        if (env.containsProperty(USERNAME_PROPERTY)) {
            builder.withUsername(env.getProperty(USERNAME_PROPERTY));
        }
        
        if (env.containsProperty(PASSWORD_PROPERTY)) {
            builder.withPassword(env.getProperty(PASSWORD_PROPERTY));
        }
        
        if (env.containsProperty(LOGGING_PROPERTY)
        &&  Boolean.valueOf(env.getProperty(LOGGING_PROPERTY))) {
            builder
                .withLogging(ApplicationBuilder.LogType.STREAM)
                .withLogging(ApplicationBuilder.LogType.APPLICATION_BUILDER)
                .withLogging(ApplicationBuilder.LogType.CONNECTION)
                .withLogging(ApplicationBuilder.LogType.STREAM_OPTIMIZER);
        }
        
        return builder;
    }
    
    @Bean
    public ProjectComponent getProjectComponent(DiamondsApplication app) {
        return app.getOrThrow(ProjectComponent.class);
    }
    
    @Bean
    public JsonComponent getJsonComponent(DiamondsApplication app) {
        return app.getOrThrow(JsonComponent.class);
    }
    
    @Bean
    public DataStoreComponent getDataStoreComponent(DiamondsApplication app) {
        return app.getOrThrow(DataStoreComponent.class);
    }
    
    @Bean
    public JoinComponent getJoinComponent(DiamondsApplication app) {
        return app.getOrThrow(JoinComponent.class);
    }
    
    @Bean
    public AllergensManager getAllergensManager(DiamondsApplication app) {
        return app.getOrThrow(AllergensManager.class);
    }
    
    @Bean
    public DiamondManager getDiamondManager(DiamondsApplication app) {
        return app.getOrThrow(DiamondManager.class);
    }
    
    @Bean
    public HibernateSequenceManager getHibernateSequenceManager(DiamondsApplication app) {
        return app.getOrThrow(HibernateSequenceManager.class);
    }
    
    @Bean
    public MealseManager getMealseManager(DiamondsApplication app) {
        return app.getOrThrow(MealseManager.class);
    }
}