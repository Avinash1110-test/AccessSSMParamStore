package com.aws.ssm.configuration;

import com.amazonaws.services.simplesystemsmanagement.AWSSimpleSystemsManagementClientBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;

// we have enabled 'EnvironmentPostProcessor' interface in META-INF -> spring.factories file
public class ParameterStorePropertySourceEnvironmentPostProcessor implements EnvironmentPostProcessor {

    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment,
                                       SpringApplication application) {
        environment.getPropertySources().addFirst(
            new ParameterStorePropertySource("AWSParameterStorePropertySource",
                                             AWSSimpleSystemsManagementClientBuilder.defaultClient()));
    }
}