/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.data.crate.config;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;
import org.springframework.data.crate.repository.config.CrateRepositoryConfigExtension;
import org.springframework.data.repository.config.RepositoryBeanDefinitionParser;
import org.springframework.data.repository.config.RepositoryConfigurationExtension;

/**
 * CrateNamespaceHandler
 *
 * @author Rizwan Idrees
 * @author Hasnain Javed
 */
public class CrateNamespaceHandler extends NamespaceHandlerSupport {

    @Override
    public void init() {
        RepositoryConfigurationExtension extension = new CrateRepositoryConfigExtension();
        RepositoryBeanDefinitionParser parser = new RepositoryBeanDefinitionParser(extension);

        registerBeanDefinitionParser("repositories", parser);
        registerBeanDefinitionParser("client", new CrateClientBeanDefinitionParser());
        registerBeanDefinitionParser("schema-export", new CratePersistentEntitySchemaManagerBeanDefinitionParser());
    }
}