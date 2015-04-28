package com.onehippo.gogreen.utils;

import org.hippoecm.hst.content.beans.ObjectBeanManagerException;
import org.hippoecm.hst.content.beans.manager.ObjectBeanManager;
import org.hippoecm.hst.content.beans.standard.HippoBean;
import org.hippoecm.hst.core.component.HstRequest;

public class BeanUtils {

	
	/**
	 * Given the request and an absolute path to bean, if it exists fetches and returns the bean
	 * otherwise returns null 
	 * 
	 * @param request
	 * @param absolutePath
	 * @return HippoBean or null
	 */
	public static HippoBean getBeanViaAbsolutePath(HstRequest request, String absolutePath){
		HippoBean result = null;
		
		ObjectBeanManager obm = request.getRequestContext().getObjectBeanManager();
		try {
			result = (HippoBean) obm.getObject(absolutePath);
		} catch (ObjectBeanManagerException e) {
		}
		
		return result;
	}
}
