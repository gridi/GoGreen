/*
 * Copyright 2012-2013 Hippo B.V. (http://www.onehippo.com)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * SET YOUR PREFERED OPTIONS IN THIS FILE
 */
var GM_PLUGIN_MAP;
function loadGoogleMap() {
    var GM_PLUGIN_LAT_LNG = new google.maps.LatLng(-34.397, 150.644);
    var GM_PLUGIN_OPTIONS = {
        zoom: 8,
        center: GM_PLUGIN_LAT_LNG,
        mapTypeId: google.maps.MapTypeId.ROADMAP
    };
    // INSTANTIATE IT:
    GM_PLUGIN_MAP = new google.maps.Map(document.getElementById("google_maps_selector"), GM_PLUGIN_OPTIONS);
    alert("I am executed");
}