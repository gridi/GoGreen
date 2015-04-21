package com.onehippo.gogreen.components;

import org.hippoecm.hst.content.beans.standard.HippoBean;
import org.hippoecm.hst.core.component.HstRequest;
import org.hippoecm.hst.core.component.HstResponse;

import com.onehippo.gogreen.beans.EventDocument;

public class GoogleMapComponent extends BaseComponent {
	
	@Override
    public void doBeforeRender(HstRequest request, HstResponse response) {

        super.doBeforeRender(request, response);
        HippoBean document = getContentBean(request);
        
        if(document!=null){
        	if(document instanceof EventDocument){
        		EventDocument event = (EventDocument) document;
        		if(event.getLocation()!=null){        			
        			if(event.getLocation().getStreet()!=null && !event.getLocation().getStreet().isEmpty()){
        				request.setAttribute("showMap", true);
        			}
        		}
        	}
        }
	}

}
