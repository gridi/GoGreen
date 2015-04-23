package com.onehippo.gogreen.components;

import org.hippoecm.hst.core.parameters.Parameter;

public interface ColorfieldInfo {
	
    String PARAM_COLOR = "color";
    
    @Parameter(name = PARAM_COLOR, required = true, displayName = "Color", defaultValue = "orange")
    String getColor();

}
