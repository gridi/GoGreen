<%--

    Copyright 2011-2013 Hippo B.V. (http://www.onehippo.com)

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

            http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

--%>

<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.hippoecm.org/jsp/hst/core" prefix='hst' %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<c:if test="${not empty logo and not empty logo.mobileLogo}">
    <hst:link var="logoSrc" hippobean="${logo.mobileLogo}"/>
    <h1><img src="${logoSrc}" alt="${fn:escapeXml(logo.alt)}" class="logo" width="${logo.mobileLogo.width}" height="${logo.mobileLogo.height}" /></h1>
</c:if>
