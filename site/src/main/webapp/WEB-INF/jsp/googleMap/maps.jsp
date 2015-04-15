<%@include file="../includes/tags.jspf" %>

<c:if test="${showMap}">
  <!-- right -->
  <c:set var="lang" value="${pageContext.request.locale.language}"/>
  <hst:element var="googleMapsApiSensor" name="script">
    <hst:attribute name="type">text/javascript</hst:attribute>
    <hst:attribute name="src">http://maps.google.com/maps/api/js?sensor=true&language=${lang}</hst:attribute>
  </hst:element>
  <hst:element var="googleMaps" name="script">
    <hst:attribute name="type">text/javascript</hst:attribute>
    <hst:attribute name="src">
      <hst:link path="/js/google_maps.js"/>
    </hst:attribute>
  </hst:element>

  <hst:headContribution keyHint="api" element="${googleMapsApiSensor}" category="jsInternal"/>
  <hst:headContribution keyHint="maps" element="${googleMaps}" category="jsInternal"/>
  <hst:headContribution keyHint="mapsInit" element="${googleMapsInit}" category="jsInternal">
    <script type="text/javascript">
      initialize();
      codeAddress();
    </script>
  </hst:headContribution>

  <div class="box-general">
    <div id="map_canvas" style="width: 288px; height: 200px;"></div>
  </div>
</c:if>