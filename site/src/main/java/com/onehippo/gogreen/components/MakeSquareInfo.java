package com.onehippo.gogreen.components;

import org.hippoecm.hst.core.parameters.Parameter;

public interface  MakeSquareInfo{
	@Parameter(name = "inthebox", required = true, displayName = "Text In The Box", defaultValue = "Empty")
	 String getInthebox();
}
