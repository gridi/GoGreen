package com.onehippo.gogreen.components;

import org.hippoecm.hst.core.component.HstRequest;
import org.hippoecm.hst.core.component.HstResponse;
import org.hippoecm.hst.core.parameters.ParametersInfo;

@ParametersInfo(type = ColorfieldInfo.class)
public class Colorfield extends BaseComponent {

	@Override
	public void doBeforeRender(HstRequest request, HstResponse response) {
		super.doBeforeRender(request, response);

		String color = "";

		ColorfieldInfo info = getComponentParametersInfo(request);
		color = info.getColor();

		request.setAttribute("color", color);
	}
}
