/**
 * Licensed to Jasig under one or more contributor license
 * agreements. See the NOTICE file distributed with this work
 * for additional information regarding copyright ownership.
 * Jasig licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a
 * copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.jasig.portlet.notice.service.rest;

import javax.portlet.PortletRequest;
import java.util.Map;

public class UserAttributeParameterEvaluator implements IParameterEvaluator {
    private String userAttributeKey;

    public void setUserAttributeKey(String userAttributeKey) {
        this.userAttributeKey = userAttributeKey;
    }

    public String evaluate(PortletRequest request) {
        @SuppressWarnings("unchecked")
        Map<String,String> userInfo = (Map<String,String>) request.getAttribute(PortletRequest.USER_INFO);
        return userInfo.get(this.userAttributeKey);
    }
}
