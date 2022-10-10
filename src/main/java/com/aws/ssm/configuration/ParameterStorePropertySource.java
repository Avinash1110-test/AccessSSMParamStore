package com.aws.ssm.configuration;

import com.amazonaws.services.simplesystemsmanagement.AWSSimpleSystemsManagement;
import com.amazonaws.services.simplesystemsmanagement.model.GetParameterRequest;
import com.amazonaws.services.simplesystemsmanagement.model.ParameterNotFoundException;
import org.springframework.core.env.PropertySource;

public class ParameterStorePropertySource extends PropertySource<AWSSimpleSystemsManagement> {

    // AWSSimpleSystemsManagement is used to manage our applications and infrastructure running in the Amazon Web Services Cloud
    // Systems Manager simplifies application and resource management, shortens the time to detect
    public ParameterStorePropertySource(String name, AWSSimpleSystemsManagement source) {
        super(name, source);
    }

    @Override
    public Object getProperty(String propertyName) {

        //to limit the AWS calls to a minimum(instead of searching all params), we need to add an if conditions as below
        if (propertyName.startsWith("/avinash")) {
            try {
                //fetching the value from SSM Parameter Store (single parameter value)
                //Note : To get information about more than one parameter at a time, use the 'GetParameters' operation.
                return source.getParameter(new GetParameterRequest().withName(propertyName)
                                .withWithDecryption(true))
                        .getParameter()
                        .getValue();
            } catch (ParameterNotFoundException ignored) {

            }
        }
        return null;
    }
}