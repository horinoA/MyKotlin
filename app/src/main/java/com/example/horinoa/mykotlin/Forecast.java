
package com.example.horinoa.mykotlin;

import java.util.HashMap;
import java.util.Map;

//@Generated("org.jsonschema2pojo")
public class Forecast {

    private String dateLabel;
    private String telop;
    private String date;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The dateLabel
     */
    public String getDateLabel() {
        return dateLabel;
    }

    /**
     * 
     * @param dateLabel
     *     The dateLabel
     */
    public void setDateLabel(String dateLabel) {
        this.dateLabel = dateLabel;
    }

    /**
     * 
     * @return
     *     The telop
     */
    public String getTelop() {
        return telop;
    }

    /**
     * 
     * @param telop
     *     The telop
     */
    public void setTelop(String telop) {
        this.telop = telop;
    }

    /**
     * 
     * @return
     *     The date
     */
    public String getDate() {
        return date;
    }

    /**
     * 
     * @param date
     *     The date
     */
    public void setDate(String date) {
        this.date = date;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
