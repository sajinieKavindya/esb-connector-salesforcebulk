/*
 * Copyright (c) 2022, WSO2 LLC. (http://www.wso2.com).
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.wso2.carbon.esb.connector.store;

import org.wso2.carbon.esb.connector.pojo.SalesforceConfig;

import java.util.concurrent.ConcurrentHashMap;

public class SalesforceConfigStore {

    private static final ConcurrentHashMap<String, SalesforceConfig> salesforceConfigMap = new ConcurrentHashMap<>();

    /**
     * Add Saqlesforce config to the store.
     * @param salesforceConfig Salesforce config to be added.
     */
    public static void addSalesforceConfig(SalesforceConfig salesforceConfig) {
        String key = salesforceConfig.getSalesforceConfigName();
        if (!salesforceConfigMap.containsKey(key)) {
            salesforceConfigMap.put(key, salesforceConfig);
        }
    }

    /**
     * Remove Salesforce config from the store.
     * @param salesforceConfigName Name of the Salesforce config to be removed.
     */
    public static void removeSalesforceConfig(String salesforceConfigName) {
        salesforceConfigMap.remove(salesforceConfigName);
    }

    /**
     * Update active access token in the store.
     * @param salesforceConfigName Name of the Salesforce config.
     * @param activeAccessToken Active access token.
     */
    public static void updateAccessToken(String salesforceConfigName, String activeAccessToken) {
        salesforceConfigMap.get(salesforceConfigName).setAccessToken(activeAccessToken);
    }

    /**
     * Get Salesforce config from the store.
     * @param salesforceConfigName Name of the Salesforce config.
     */
    public static SalesforceConfig getSalesforceConfig(String salesforceConfigName) {
        return salesforceConfigMap.get(salesforceConfigName);
    }

}
