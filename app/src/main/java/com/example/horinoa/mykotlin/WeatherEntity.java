
package com.example.horinoa.mykotlin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@Generated("org.jsonschema2pojo")
public class WeatherEntity {

    private List<PinpointLocation> pinpointLocations = new ArrayList<PinpointLocation>();
    private String link;
    private List<Forecast> forecasts = new ArrayList<Forecast>();
    private String publicTime;
    private String title;
    private Description description;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The pinpointLocations
     */
    public List<PinpointLocation> getPinpointLocations() {
        return pinpointLocations;
    }

    /**
     * 
     * @param pinpointLocations
     *     The pinpointLocations
     */
    public void setPinpointLocations(List<PinpointLocation> pinpointLocations) {
        this.pinpointLocations = pinpointLocations;
    }

    /**
     * 
     * @return
     *     The link
     */
    public String getLink() {
        return link;
    }

    /**
     * 
     * @param link
     *     The link
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * 
     * @return
     *     The forecasts
     */
    public List<Forecast> getForecasts() {
        return forecasts;
    }

    /**
     * 
     * @param forecasts
     *     The forecasts
     */
    public void setForecasts(List<Forecast> forecasts) {
        this.forecasts = forecasts;
    }

    /**
     * 
     * @return
     *     The publicTime
     */
    public String getPublicTime() {
        return publicTime;
    }

    /**
     * 
     * @param publicTime
     *     The publicTime
     */
    public void setPublicTime(String publicTime) {
        this.publicTime = publicTime;
    }

    /**
     * 
     * @return
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The description
     */
    public Description getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    public void setDescription(Description description) {
        this.description = description;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
