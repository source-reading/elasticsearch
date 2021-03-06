/*
 * Licensed to Elasticsearch under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.elasticsearch.bootstrap;

import org.elasticsearch.test.ESTestCase;

public class BootstrapTests extends ESTestCase {

    public void testConfigDeprecation() {
        Bootstrap.checkConfigExtension(".json");
        assertWarnings("elasticsearch.json is deprecated; rename your configuration file to elasticsearch.yaml");
        Bootstrap.checkConfigExtension(".yml");
        assertWarnings("elasticsearch.yml is deprecated; rename your configuration file to elasticsearch.yaml");
        Bootstrap.checkConfigExtension(".yaml"); // no warnings, will be checked in @After
    }
}
