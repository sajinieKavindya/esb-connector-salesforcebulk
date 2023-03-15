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
package org.wso2.carbon.esb.connector.pojo;

/**
 * This class is used to add and get OAuth configurations
 */
public class SalesforceConfig {
    private String grantType = null;
    private String clientId = null;
    private String clientSecret = null;
    private String refreshToken = null;
    private String tokenId = null;
    private String accessToken = null;
    private String sfOAuthConfigName = null;
    private String instanceUrl = null;

    public String getInstanceUrl() {

        return instanceUrl;
    }

    public void setInstanceUrl(String instanceUrl) {

        this.instanceUrl = instanceUrl;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getSalesforceConfigName() {
        return sfOAuthConfigName;
    }

    public void setSalesforceConfigName(String sfOAuthConfigName) {
        this.sfOAuthConfigName = sfOAuthConfigName;
    }
}
