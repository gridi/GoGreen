package com.onehippo.gogreen.components;

import org.hippoecm.hst.core.parameters.DropDownList;
import org.hippoecm.hst.core.parameters.JcrPath;
import org.hippoecm.hst.core.parameters.Parameter;





public interface ColorfieldInfo {
	
    String PARAM_COLOR = "color";
    
    @Parameter(name = PARAM_COLOR, required = true, displayName = "Color", defaultValue = "orange")
    @DropDownList(value= {"red","blue","yellow", "green", "black"})
    String getColor();
    
    @Parameter(name = "imagePath", required = false, displayName = "Inmage Path", defaultValue = "")
    @JcrPath(pickerConfiguration = "cms-pickers/images", pickerSelectableNodeTypes = "hippogogreengallery:imageset")
    String getImagePath();
    
    @Parameter(name = "documentPath", required = false, displayName = "Document Path", defaultValue = "")
    @JcrPath(pickerInitialPath = "products", pickerSelectableNodeTypes = "hippogogreen:product", pickerRemembersLastVisited=false, isRelative=true)
    String getProductDocument();
    
}
