package com.onehippo.gogreen.components;

import com.onehippo.gogreen.beans.EventDocument;

import org.hippoecm.hst.content.beans.standard.HippoBean;
import org.hippoecm.hst.core.component.HstRequest;
import org.hippoecm.hst.core.component.HstResponse;

public class GoogleMap extends BaseComponent {

    @Override
    public void doBeforeRender(HstRequest request, HstResponse response) {
        super.doBeforeRender(request, response);
        HippoBean document = getContentBean(request);
        if (document != null) {
            if (document instanceof EventDocument) {
                EventDocument event = (EventDocument) document;
                if (!(event.getLocation().getCity().isEmpty())) {
                    request.setAttribute("showMap", true);
                }
            }
        }
    }
}