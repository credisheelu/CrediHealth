
package credihealth.app.com.credihealth.models.doctor;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TopSpec {

    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("created_by")
    @Expose
    private Object createdBy;
    @Expose
    private Object description;
    @Expose
    private int id;
    @Expose
    private String specialist;
    @SerializedName("speciality_type")
    @Expose
    private String specialityType;
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

    public TopSpec withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 
     * @return
     *     The createdBy
     */
    public Object getCreatedBy() {
        return createdBy;
    }

    /**
     * 
     * @param createdBy
     *     The created_by
     */
    public void setCreatedBy(Object createdBy) {
        this.createdBy = createdBy;
    }

    public TopSpec withCreatedBy(Object createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * 
     * @return
     *     The description
     */
    public Object getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    public void setDescription(Object description) {
        this.description = description;
    }

    public TopSpec withDescription(Object description) {
        this.description = description;
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

    public TopSpec withId(int id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The specialist
     */
    public String getSpecialist() {
        return specialist;
    }

    /**
     * 
     * @param specialist
     *     The specialist
     */
    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    public TopSpec withSpecialist(String specialist) {
        this.specialist = specialist;
        return this;
    }

    /**
     * 
     * @return
     *     The specialityType
     */
    public String getSpecialityType() {
        return specialityType;
    }

    /**
     * 
     * @param specialityType
     *     The speciality_type
     */
    public void setSpecialityType(String specialityType) {
        this.specialityType = specialityType;
    }

    public TopSpec withSpecialityType(String specialityType) {
        this.specialityType = specialityType;
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

    public TopSpec withTitle(String title) {
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

    public TopSpec withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }



}
