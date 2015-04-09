/*
 *  Copyright 2012-2013 Hippo B.V. (http://www.onehippo.com)
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.onehippo.gogreen.selection;

import org.apache.wicket.behavior.AbstractBehavior;
import org.apache.wicket.behavior.HeaderContributor;
import org.apache.wicket.behavior.IBehavior;
import org.apache.wicket.markup.html.IHeaderResponse;
import org.hippoecm.frontend.plugin.IPlugin;
import org.hippoecm.frontend.plugin.IPluginContext;
import org.hippoecm.frontend.plugin.config.IPluginConfig;
import org.hippoecm.frontend.service.IBehaviorService;

public class HelpOverlay extends AbstractBehavior implements IPlugin, IBehaviorService {

    public HelpOverlay(IPluginContext context, IPluginConfig config) {
        context.registerService(this, "wicket.root.behavior");
    }

    @Override
    public void renderHead(final IHeaderResponse response) {
        super.renderHead(response);

        HeaderContributor.forCss("skin/help-overlay.css").renderHead(response);
        HeaderContributor.forJavaScript("skin/js/jquery-1.4.2.min.js").renderHead(response);
        HeaderContributor.forJavaScript("skin/js/jquery.tools.min.js").renderHead(response);
        HeaderContributor.forJavaScript("skin/js/help-overlay.js").renderHead(response);
    }

    @Override
    public void start() {
    }

    @Override
    public void stop() {
    }

    @Override
    public IBehavior getBehavior() {
        return this;
    }

    @Override
    public String getComponentPath() {
        return null;
    }
}
