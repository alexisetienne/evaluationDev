//package fr.bleu122.evaluation.config;
//
//import org.keycloak.adapters.springsecurity.KeycloakConfiguration;
//import org.keycloak.adapters.springsecurity.authentication.KeycloakAuthenticationProvider;
//import org.keycloak.adapters.springsecurity.config.KeycloakWebSecurityConfigurerAdapter;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.core.authority.mapping.SimpleAuthorityMapper;
//import org.springframework.security.web.authentication.session.NullAuthenticatedSessionStrategy;
//import org.springframework.security.web.authentication.session.SessionAuthenticationStrategy;
//
//public class KeycloakConfig {
//
//    @KeycloakConfiguration
//    @ConditionalOnProperty(name = "keycloak.enabled", havingValue = "true", matchIfMissing = true)
//    public static class KeycloakConfigurationAdapter extends KeycloakWebSecurityConfigurerAdapter {
//
//        @Bean
//        @Override
//        protected SessionAuthenticationStrategy sessionAuthenticationStrategy() {
//            // required for bearer-only applications.
//            return new NullAuthenticatedSessionStrategy();
//        }
//    }
//}
