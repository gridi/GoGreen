package com.onehippo.gogreen.components;

import org.hippoecm.hst.content.beans.standard.HippoBean;
import org.hippoecm.hst.core.component.HstRequest;
import org.hippoecm.hst.core.component.HstResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.onehippo.gogreen.beans.EventDocument;
import com.onehippo.gogreen.beans.compound.Address;


public class GoogleMaps extends BaseComponent {
    
    public static final Logger log = LoggerFactory.getLogger(GoogleMaps.class);

    @Override
    public void doBeforeRender(HstRequest request, HstResponse response) {
        super.doBeforeRender(request, response);

        boolean showMap = false;
       
        HippoBean document = getContentBean(request);

        if(document != null) {
            if(document instanceof EventDocument){
                showMap = shouldShowMap(document);
            }
        }

        request.setAttribute("showMap", showMap);
    }

    private boolean shouldShowMap(HippoBean document) {
        
        boolean result = false;
        EventDocument event = (EventDocument) document;
        if(event.getLocation() != null && !isCityEmpty(event.getLocation()) && !isStreetEmpty(event.getLocation())){
            result = true;
        }
        return result;
    }
    
    private boolean isCityEmpty(Address address){
        boolean result = true;
        if(address.getCity()!=null && !address.getCity().isEmpty()){
            result = false;
        }
        return result;
    }
    
    private boolean isStreetEmpty(Address address){
        boolean result = true;
        if(address.getStreet()!=null && !address.getStreet().isEmpty()){
            result = false;
        }
        return result;
    }
    
}
