package com.onehippo.gogreen.components;

import org.hippoecm.hst.core.component.HstRequest;
import org.hippoecm.hst.core.component.HstResponse;

public class Colorfield extends BaseComponent {

	@Override
	public void doBeforeRender(HstRequest request, HstResponse response) {

		super.doBeforeRender(request, response);

		int nummer = (int) (Math.random() * 2);
		
		boolean greenText = true;
		

			
		if (nummer == 0){
			greenText = true;
		} else {
			greenText = false;
		}
		
		
		request.setAttribute("green", greenText);
	}
}
