<%@include file="../includes/tags.jspf"%>




<c:choose>
  <c:when test="${green}">
    <FONT SIZE="6" COLOR="#CCFF66" FACE="Courier New"><b>Gelijk aan 0 in groen.</b></FONT>
  </c:when>
  <c:otherwise>
    <FONT SIZE="6" COLOR="#FF0000" FACE="Courier New"><b>Groter dan 0 in rood.</b></FONT>
  </c:otherwise>
</c:choose>