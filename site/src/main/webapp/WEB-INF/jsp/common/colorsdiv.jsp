<%@include file="../includes/tags.jspf" %>

<p>Random number: ${randomNumber}</p>


<hst:cmseditlink hippobean="${document}" />
<h2>Title: <c:out value="${document.title}"/></h2>

<%-- <p><hst:html hippohtml="${document.description}"/></p>  --%>

<c:if test="${hst:isReadable(document, 'image') and not empty document.image}">
	<c:set var="image" value="${document.image}" />
	<hst:link var="src" hippobean="${image.largeThumbnail}" />
	<img class="image" src="${fn:escapeXml(src)}" alt="${fn:escapeXml(image.alt)}" />
</c:if>
