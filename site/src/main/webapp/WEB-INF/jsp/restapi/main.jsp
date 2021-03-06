<%--

    Copyright 2010-2013 Hippo B.V. (http://www.onehippo.com)

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

<%@include file="../includes/tags.jspf" %>

<c:set var="resttitle"><fmt:message key="restapi.main.title"/></c:set>

<c:set var="datePattern" value="dd-MM-yyyy"/>
<div class="yui-main">
  <div id="content" class="yui-b left-and-right">
    <div>
      <ol id="breadcrumbs">
        <li><fmt:message key="restapi.main.location.label"/></li>
        <li>
          <hst:link var="home" siteMapItemRefId="home" />
          <a href="${home}"><fmt:message key="restapi.main.location.home"/></a> &gt;
        </li>
      </ol>
      <hippo-gogreen:title title="${resttitle}"/>
    </div>

    <div id="article" class="about <c:if test="${preview}">editable</c:if>">
      <hst:cmseditlink hippobean="${document}" />
      <h2 class="title"><c:out value="${document.title}"/></h2>
      
      <p class="intro"><c:out value="${document.summary}"/></p>
             
      <div class="yui-cssbase body">
        <hst:html hippohtml="${document.description}"/>
      </div>
    </div>
  </div>
</div>