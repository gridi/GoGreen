package com.onehippo.gogreen.components;

import java.util.List;

import org.hippoecm.hst.content.beans.standard.HippoBean;
import org.hippoecm.hst.content.beans.standard.HippoDocumentBean;
import org.hippoecm.hst.content.beans.standard.HippoFolderBean;
import org.hippoecm.hst.core.component.HstRequest;
import org.hippoecm.hst.core.component.HstResponse;

public class DivWithColors extends BaseComponent {
	
	@Override
    public void doBeforeRender(HstRequest request, HstResponse response) {

        super.doBeforeRender(request, response);
        
        int nummer = (int)(Math.random()*122);

        request.setAttribute("randomNumber", nummer);
       
        HippoBean contentBean = getContentBean(request);
        
        if (contentBean != null) {
        	
        	 if (contentBean.isHippoDocumentBean()) {
                 request.setAttribute("document", contentBean);
             } else if (contentBean.isHippoFolderBean()) { 
            	 HippoFolderBean folder = (HippoFolderBean) contentBean;
            	 List<HippoDocumentBean> documents = folder.getDocuments();
            	 request.setAttribute("document", documents.get(0));
            	 
             }
        }
        
}
	
	}
