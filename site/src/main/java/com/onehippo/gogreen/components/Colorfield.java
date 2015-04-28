package com.onehippo.gogreen.components;

import org.hippoecm.hst.content.beans.standard.HippoBean;
import org.hippoecm.hst.core.component.HstRequest;
import org.hippoecm.hst.core.component.HstResponse;
import org.hippoecm.hst.core.parameters.ParametersInfo;

import com.onehippo.gogreen.beans.compound.ImageSet;
import com.onehippo.gogreen.utils.BeanUtils;

@ParametersInfo(type = ColorfieldInfo.class)
public class Colorfield extends BaseComponent {

	@Override
	public void doBeforeRender(HstRequest request, HstResponse response) {
		super.doBeforeRender(request, response);

		ColorfieldInfo info = getComponentParametersInfo(request);
		String color = info.getColor();
		request.setAttribute("color", color);
		
		String documentPath = info.getProductDocument();
		if(documentPath!=null && !documentPath.isEmpty()){
			HippoBean baseBean = getSiteContentBaseBean(request);
			HippoBean document = baseBean.getBean(documentPath);
			if(document!=null){				
				request.setAttribute("document", document);
			}
		}
		
		String imagePath = info.getImagePath();
		HippoBean bean = BeanUtils.getBeanViaAbsolutePath(request, imagePath);
		
		if(bean != null && bean instanceof ImageSet){
			ImageSet image = (ImageSet) bean;
			request.setAttribute("image", image);
		}
	}
}
