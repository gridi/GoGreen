<%@include file="../includes/tags.jspf"%>

    <FONT SIZE="6" COLOR="${color}" FACE="Courier New"><b>Het is ${color}.</b></FONT>
    
    <c:if test="${not empty image && not empty document}">
        <a href="<hst:link hippobean="${document}"/>">
          <img src="<hst:link hippobean="${image.original}"/>" alt="${color}" title="${color}"/>
        </a>
    </c:if>
