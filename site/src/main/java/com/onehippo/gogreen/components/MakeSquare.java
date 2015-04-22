package com.onehippo.gogreen.components;

import org.hippoecm.hst.core.component.HstRequest;
import org.hippoecm.hst.core.component.HstResponse;
import org.hippoecm.hst.core.parameters.ParametersInfo;

@ParametersInfo(type = MakeSquareInfo.class)
public class MakeSquare extends BaseComponent {

	@Override
	public void doBeforeRender(HstRequest request, HstResponse response) {

		super.doBeforeRender(request, response);

		MakeSquareInfo info = getComponentParametersInfo(request);

		String text = info.getInthebox();
		request.setAttribute("inthebox", text);
	}
}