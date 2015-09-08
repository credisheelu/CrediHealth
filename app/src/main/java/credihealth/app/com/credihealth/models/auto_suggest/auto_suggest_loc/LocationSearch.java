
package credihealth.app.com.credihealth.models.auto_suggest.auto_suggest_loc;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class LocationSearch {

    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("filter_city_name")
    @Expose
    private String filterCityName;
    @SerializedName("full_title")
    @Expose
    private String fullTitle;
    @Expose
    private int id;
    @Expose
    private String latitude;
    @SerializedName("locationable_id")
    @Expose
    private int locationableId;
    @SerializedName("locationable_type")
    @Expose
    private String locationableType;
    @Expose
    private String longitude;
    @SerializedName("operational_city_name")
    @Expose
    private String operationalCityName;
    @SerializedName("ordering_locality")
    @Expose
    private int orderingLocality;
    @Expose
    private String title;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;

    /**
     * 
     * @return
     *     The createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * 
     * @param createdAt
     *     The created_at
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public LocationSearch withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 
     * @return
     *     The filterCityName
     */
    public String getFilterCityName() {
        return filterCityName;
    }

    /**
     * 
     * @param filterCityName
     *     The filter_city_name
     */
    public void setFilterCityName(String filterCityName) {
        this.filterCityName = filterCityName;
    }

    public LocationSearch withFilterCityName(String filterCityName) {
        this.filterCityName = filterCityName;
        return this;
    }

    /**
     * 
     * @return
     *     The fullTitle
     */
    public String getFullTitle() {
        return fullTitle;
    }

    /**
     * 
     * @param fullTitle
     *     The full_title
     */
    public void setFullTitle(String fullTitle) {
        this.fullTitle = fullTitle;
    }

    public LocationSearch withFullTitle(String fullTitle) {
        this.fullTitle = fullTitle;
        return this;
    }

    /**
     * 
     * @return
     *     The id
     */
    public int getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(int id) {
        this.id = id;
    }

    public LocationSearch withId(int id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The latitude
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * 
     * @param latitude
     *     The latitude
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public LocationSearch withLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }

    /**
     * 
     * @return
     *     The locationableId
     */
    public int getLocationableId() {
        return locationableId;
    }

    /**
     * 
     * @param locationableId
     *     The locationable_id
     */
    public void setLocationableId(int locationableId) {
        this.locationableId = locationableId;
    }

    public LocationSearch withLocationableId(int locationableId) {
        this.locationableId = locationableId;
        return this;
    }

    /**
     * 
     * @return
     *     The locationableType
     */
    public String getLocationableType() {
        return locationableType;
    }

    /**
     * 
     * @param locationableType
     *     The locationable_type
     */
    public void setLocationableType(String locationableType) {
        this.locationableType = locationableType;
    }

    public LocationSearch withLocationableType(String locationableType) {
        this.locationableType = locationableType;
        return this;
    }

    /**
     * 
     * @return
     *     The longitude
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * 
     * @param longitude
     *     The longitude
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public LocationSearch withLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }

    /**
     * 
     * @return
     *     The operationalCityName
     */
    public String getOperationalCityName() {
        return operationalCityName;
    }

    /**
     * 
     * @param operationalCityName
     *     The operational_city_name
     */
    public void setOperationalCityName(String operationalCityName) {
        this.operationalCityName = operationalCityName;
    }

    public LocationSearch withOperationalCityName(String operationalCityName) {
        this.operationalCityName = operationalCityName;
        return this;
    }

    /**
     * 
     * @return
     *     The orderingLocality
     */
    public int getOrderingLocality() {
        return orderingLocality;
    }

    /**
     * 
     * @param orderingLocality
     *     The ordering_locality
     */
    public void setOrderingLocality(int orderingLocality) {
        this.orderingLocality = orderingLocality;
    }

    public LocationSearch withOrderingLocality(int orderingLocality) {
        this.orderingLocality = orderingLocality;
        return this;
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

    public LocationSearch withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 
     * @return
     *     The updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 
     * @param updatedAt
     *     The updated_at
     */
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public LocationSearch withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

}
