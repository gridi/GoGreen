package com.onehippo.gogreen.components;

import org.hippoecm.hst.content.beans.standard.HippoBean;
import org.hippoecm.hst.core.component.HstRequest;
import org.hippoecm.hst.core.component.HstResponse;

import com.onehippo.gogreen.beans.JobsDocument;
import com.onehippo.gogreen.beans.Product;

public class ContentTypeComponent extends BaseComponent{
	
    private static final String PARAM_COLOR = "color";
    private static final String DEFAULT_COLOR = "orange";
    private static final String DOCUMENTTYPE = "documenttype";

	
	@Override
    public void doBeforeRender(HstRequest request, HstResponse response) {
        super.doBeforeRender(request, response);
        
        HippoBean bean = getContentBean(request);
        
        if (bean == null) {
            return;
        }

        // get the color
        String color = getComponentParameter(PARAM_COLOR);
        if (color == null) {
        	color = DEFAULT_COLOR;
        }
        request.setAttribute("color", color);
        
        if (bean instanceof Product) {
        	request.setAttribute(DOCUMENTTYPE, "Product");
        } else if (bean instanceof JobsDocument) {
        	request.setAttribute(DOCUMENTTYPE, "JobsDocument");
        } else {
        	request.setAttribute(DOCUMENTTYPE, "");
        }
                
	}

}
