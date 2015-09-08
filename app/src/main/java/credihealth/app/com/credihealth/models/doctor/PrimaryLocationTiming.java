
package credihealth.app.com.credihealth.models.doctor;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PrimaryLocationTiming {

    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("created_by")
    @Expose
    private int createdBy;
    @SerializedName("doctor_id")
    @Expose
    private Object doctorId;
    @SerializedName("doctor_locations_rel_id")
    @Expose
    private int doctorLocationsRelId;
    @SerializedName("from_time")
    @Expose
    private String fromTime;
    @Expose
    private int id;
    @SerializedName("to_time")
    @Expose
    private String toTime;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("visit_day")
    @Expose
    private int visitDay;

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

    public PrimaryLocationTiming withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 
     * @return
     *     The createdBy
     */
    public int getCreatedBy() {
        return createdBy;
    }

    /**
     * 
     * @param createdBy
     *     The created_by
     */
    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public PrimaryLocationTiming withCreatedBy(int createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * 
     * @return
     *     The doctorId
     */
    public Object getDoctorId() {
        return doctorId;
    }

    /**
     * 
     * @param doctorId
     *     The doctor_id
     */
    public void setDoctorId(Object doctorId) {
        this.doctorId = doctorId;
    }

    public PrimaryLocationTiming withDoctorId(Object doctorId) {
        this.doctorId = doctorId;
        return this;
    }

    /**
     * 
     * @return
     *     The doctorLocationsRelId
     */
    public int getDoctorLocationsRelId() {
        return doctorLocationsRelId;
    }

    /**
     * 
     * @param doctorLocationsRelId
     *     The doctor_locations_rel_id
     */
    public void setDoctorLocationsRelId(int doctorLocationsRelId) {
        this.doctorLocationsRelId = doctorLocationsRelId;
    }

    public PrimaryLocationTiming withDoctorLocationsRelId(int doctorLocationsRelId) {
        this.doctorLocationsRelId = doctorLocationsRelId;
        return this;
    }

    /**
     * 
     * @return
     *     The fromTime
     */
    public String getFromTime() {
        return fromTime;
    }

    /**
     * 
     * @param fromTime
     *     The from_time
     */
    public void setFromTime(String fromTime) {
        this.fromTime = fromTime;
    }

    public PrimaryLocationTiming withFromTime(String fromTime) {
        this.fromTime = fromTime;
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

    public PrimaryLocationTiming withId(int id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The toTime
     */
    public String getToTime() {
        return toTime;
    }

    /**
     * 
     * @param toTime
     *     The to_time
     */
    public void setToTime(String toTime) {
        this.toTime = toTime;
    }

    public PrimaryLocationTiming withToTime(String toTime) {
        this.toTime = toTime;
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

    public PrimaryLocationTiming withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 
     * @return
     *     The visitDay
     */
    public int getVisitDay() {
        return visitDay;
    }

    /**
     * 
     * @param visitDay
     *     The visit_day
     */
    public void setVisitDay(int visitDay) {
        this.visitDay = visitDay;
    }

    public PrimaryLocationTiming withVisitDay(int visitDay) {
        this.visitDay = visitDay;
        return this;
    }



}
