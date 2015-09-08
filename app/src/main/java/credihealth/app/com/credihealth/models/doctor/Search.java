
package credihealth.app.com.credihealth.models.doctor;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Search {

    @Expose
    private int id;
    @SerializedName("doc_name")
    @Expose
    private String docName;
    @SerializedName("hosp_name")
    @Expose
    private String hospName;
    @Expose
    private String designation;
    @Expose
    private String qualifications;
    @SerializedName("profile_pic_url")
    @Expose
    private String profilePicUrl;
    @SerializedName("profile_url")
    @Expose
    private String profileUrl;
    @SerializedName("award_ids")
    @Expose
    private List<Integer> awardIds = new ArrayList<Integer>();
    @SerializedName("healthcare_centre_ids")
    @Expose
    private List<Integer> healthcareCentreIds = new ArrayList<Integer>();
    @SerializedName("practice_years")
    @Expose
    private int practiceYears;
    @SerializedName("primary_location_opd_charges")
    @Expose
    private int primaryLocationOpdCharges;
    @SerializedName("primary_location_id")
    @Expose
    private int primaryLocationId;
    @SerializedName("primary_location_timings")
    @Expose
    private List<PrimaryLocationTiming> primaryLocationTimings = new ArrayList<PrimaryLocationTiming>();
    @SerializedName("healthcare_centres_names")
    @Expose
    private List<String> healthcareCentresNames = new ArrayList<String>();
    @SerializedName("doctor_locations_rel_ids")
    @Expose
    private List<Integer> doctorLocationsRelIds = new ArrayList<Integer>();
    @SerializedName("top_spec")
    @Expose
    private TopSpec topSpec;
    @Expose
    private float distance;
    @Expose
    private Object latitude;
    @Expose
    private Object longitude;

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

    public Search withId(int id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The docName
     */
    public String getDocName() {
        return docName;
    }

    /**
     * 
     * @param docName
     *     The doc_name
     */
    public void setDocName(String docName) {
        this.docName = docName;
    }

    public Search withDocName(String docName) {
        this.docName = docName;
        return this;
    }

    /**
     * 
     * @return
     *     The hospName
     */
    public String getHospName() {
        return hospName;
    }

    /**
     * 
     * @param hospName
     *     The hosp_name
     */
    public void setHospName(String hospName) {
        this.hospName = hospName;
    }

    public Search withHospName(String hospName) {
        this.hospName = hospName;
        return this;
    }

    /**
     * 
     * @return
     *     The designation
     */
    public String getDesignation() {
        return designation;
    }

    /**
     * 
     * @param designation
     *     The designation
     */
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Search withDesignation(String designation) {
        this.designation = designation;
        return this;
    }

    /**
     * 
     * @return
     *     The qualifications
     */
    public String getQualifications() {
        return qualifications;
    }

    /**
     * 
     * @param qualifications
     *     The qualifications
     */
    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }

    public Search withQualifications(String qualifications) {
        this.qualifications = qualifications;
        return this;
    }

    /**
     * 
     * @return
     *     The profilePicUrl
     */
    public String getProfilePicUrl() {
        return profilePicUrl;
    }

    /**
     * 
     * @param profilePicUrl
     *     The profile_pic_url
     */
    public void setProfilePicUrl(String profilePicUrl) {
        this.profilePicUrl = profilePicUrl;
    }

    public Search withProfilePicUrl(String profilePicUrl) {
        this.profilePicUrl = profilePicUrl;
        return this;
    }

    /**
     * 
     * @return
     *     The profileUrl
     */
    public String getProfileUrl() {
        return profileUrl;
    }

    /**
     * 
     * @param profileUrl
     *     The profile_url
     */
    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }

    public Search withProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
        return this;
    }

    /**
     * 
     * @return
     *     The awardIds
     */
    public List<Integer> getAwardIds() {
        return awardIds;
    }

    /**
     * 
     * @param awardIds
     *     The award_ids
     */
    public void setAwardIds(List<Integer> awardIds) {
        this.awardIds = awardIds;
    }

    public Search withAwardIds(List<Integer> awardIds) {
        this.awardIds = awardIds;
        return this;
    }

    /**
     * 
     * @return
     *     The healthcareCentreIds
     */
    public List<Integer> getHealthcareCentreIds() {
        return healthcareCentreIds;
    }

    /**
     * 
     * @param healthcareCentreIds
     *     The healthcare_centre_ids
     */
    public void setHealthcareCentreIds(List<Integer> healthcareCentreIds) {
        this.healthcareCentreIds = healthcareCentreIds;
    }

    public Search withHealthcareCentreIds(List<Integer> healthcareCentreIds) {
        this.healthcareCentreIds = healthcareCentreIds;
        return this;
    }

    /**
     * 
     * @return
     *     The practiceYears
     */
    public int getPracticeYears() {
        return practiceYears;
    }

    /**
     * 
     * @param practiceYears
     *     The practice_years
     */
    public void setPracticeYears(int practiceYears) {
        this.practiceYears = practiceYears;
    }

    public Search withPracticeYears(int practiceYears) {
        this.practiceYears = practiceYears;
        return this;
    }

    /**
     * 
     * @return
     *     The primaryLocationOpdCharges
     */
    public int getPrimaryLocationOpdCharges() {
        return primaryLocationOpdCharges;
    }

    /**
     * 
     * @param primaryLocationOpdCharges
     *     The primary_location_opd_charges
     */
    public void setPrimaryLocationOpdCharges(int primaryLocationOpdCharges) {
        this.primaryLocationOpdCharges = primaryLocationOpdCharges;
    }

    public Search withPrimaryLocationOpdCharges(int primaryLocationOpdCharges) {
        this.primaryLocationOpdCharges = primaryLocationOpdCharges;
        return this;
    }

    /**
     * 
     * @return
     *     The primaryLocationId
     */
    public int getPrimaryLocationId() {
        return primaryLocationId;
    }

    /**
     * 
     * @param primaryLocationId
     *     The primary_location_id
     */
    public void setPrimaryLocationId(int primaryLocationId) {
        this.primaryLocationId = primaryLocationId;
    }

    public Search withPrimaryLocationId(int primaryLocationId) {
        this.primaryLocationId = primaryLocationId;
        return this;
    }

    /**
     * 
     * @return
     *     The primaryLocationTimings
     */
    public List<PrimaryLocationTiming> getPrimaryLocationTimings() {
        return primaryLocationTimings;
    }

    /**
     * 
     * @param primaryLocationTimings
     *     The primary_location_timings
     */
    public void setPrimaryLocationTimings(List<PrimaryLocationTiming> primaryLocationTimings) {
        this.primaryLocationTimings = primaryLocationTimings;
    }

    public Search withPrimaryLocationTimings(List<PrimaryLocationTiming> primaryLocationTimings) {
        this.primaryLocationTimings = primaryLocationTimings;
        return this;
    }

    /**
     * 
     * @return
     *     The healthcareCentresNames
     */
    public List<String> getHealthcareCentresNames() {
        return healthcareCentresNames;
    }

    /**
     * 
     * @param healthcareCentresNames
     *     The healthcare_centres_names
     */
    public void setHealthcareCentresNames(List<String> healthcareCentresNames) {
        this.healthcareCentresNames = healthcareCentresNames;
    }

    public Search withHealthcareCentresNames(List<String> healthcareCentresNames) {
        this.healthcareCentresNames = healthcareCentresNames;
        return this;
    }

    /**
     * 
     * @return
     *     The doctorLocationsRelIds
     */
    public List<Integer> getDoctorLocationsRelIds() {
        return doctorLocationsRelIds;
    }

    /**
     * 
     * @param doctorLocationsRelIds
     *     The doctor_locations_rel_ids
     */
    public void setDoctorLocationsRelIds(List<Integer> doctorLocationsRelIds) {
        this.doctorLocationsRelIds = doctorLocationsRelIds;
    }

    public Search withDoctorLocationsRelIds(List<Integer> doctorLocationsRelIds) {
        this.doctorLocationsRelIds = doctorLocationsRelIds;
        return this;
    }

    /**
     * 
     * @return
     *     The topSpec
     */
    public TopSpec getTopSpec() {
        return topSpec;
    }

    /**
     * 
     * @param topSpec
     *     The top_spec
     */
    public void setTopSpec(TopSpec topSpec) {
        this.topSpec = topSpec;
    }

    public Search withTopSpec(TopSpec topSpec) {
        this.topSpec = topSpec;
        return this;
    }

    /**
     * 
     * @return
     *     The distance
     */
    public float getDistance() {
        return distance;
    }

    /**
     * 
     * @param distance
     *     The distance
     */
    public void setDistance(float distance) {
        this.distance = distance;
    }

    public Search withDistance(float distance) {
        this.distance = distance;
        return this;
    }

    /**
     * 
     * @return
     *     The latitude
     */
    public Object getLatitude() {
        return latitude;
    }

    /**
     * 
     * @param latitude
     *     The latitude
     */
    public void setLatitude(Object latitude) {
        this.latitude = latitude;
    }

    public Search withLatitude(Object latitude) {
        this.latitude = latitude;
        return this;
    }

    /**
     * 
     * @return
     *     The longitude
     */
    public Object getLongitude() {
        return longitude;
    }

    /**
     * 
     * @param longitude
     *     The longitude
     */
    public void setLongitude(Object longitude) {
        this.longitude = longitude;
    }

    public Search withLongitude(Object longitude) {
        this.longitude = longitude;
        return this;
    }


}
