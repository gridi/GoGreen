/*
 * Copyright 2010-2013 Hippo B.V. (http://www.onehippo.com)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.onehippo.gogreen.components;

import org.hippoecm.hst.core.parameters.Parameter;

/**
 * HST Component Parameters Info class for the Feed. Used by the PageComposer.
 */
public interface FeedParamsInfo {
    String PARAM_TITLE = "title";
    String PARAM_FEEDURL = "feedURL";
    String PARAM_NUMBEROFITEMS = "numberOfItems";
    String PARAM_UPDATEINTERVAL = "updateInterval";
    String PARAM_CONNECTTIMEOUT = "connectTimeout";
    String PARAM_READTIMEOUT = "readTimeout";

    @Parameter(name = PARAM_TITLE, required = false, displayName = "Title", defaultValue = "Feed")
    String getTitle();

    @Parameter(name = PARAM_FEEDURL, required = true, displayName = "Url", defaultValue = "")
    String getFeedUrl();

    @Parameter(name = PARAM_NUMBEROFITEMS, required = true, displayName = "Nr of Items", defaultValue = "3")
    int getNumberOfItems();

    @Parameter(name = PARAM_UPDATEINTERVAL, required = true, displayName = "Update interval", defaultValue = "15")
    int getUpdateInterval();

    @Parameter(name = PARAM_CONNECTTIMEOUT, required = true, displayName = "Connect timeout (ms)", defaultValue = "2000")
    int getConnectTimeout();

    @Parameter(name = PARAM_READTIMEOUT, required = true, displayName = "Read timeout (ms)", defaultValue = "5000")
    int getReadTimeout();

}
