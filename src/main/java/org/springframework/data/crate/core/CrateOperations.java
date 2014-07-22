/*
 * Copyright 2002-2014 the original author or authors.
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

package org.springframework.data.crate.core;

import org.springframework.data.crate.core.convert.CrateConverter;

/**
 * 
 * @author Hasnain Javed
 * @author Rizwan Idrees
 *
 * @since 1.0.0
 */
public interface CrateOperations {

    /**
     * Get the crate converter in use
     * @return CrateConverter
     */
    CrateConverter getConverter();

    /**
     * Creates a table based on clazz
     * @param clazz
     * @param <T>
     * @return
     */
    <T> boolean createTable(Class<T> clazz);

    /**
     * Drops the table associated with clazz
     * @param clazz
     * @param <T>
     * @return
     */

    <T> boolean dropTable(Class<T> clazz);

    /**
     * Drops the table
     * @param name
     * @param <T>
     * @return
     */

    <T> boolean dropTable(String name);


}