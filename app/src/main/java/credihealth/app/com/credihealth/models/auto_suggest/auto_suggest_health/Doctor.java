
package credihealth.app.com.credihealth.models.auto_suggest.auto_suggest_health;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Doctor {

    @SerializedName("full_name")
    @Expose
    private String fullName;
    @Expose
    private int id;
    @Expose
    private String speciality;

    /**
     * 
     * @return
     *     The fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * 
     * @param fullName
     *     The full_name
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Doctor withFullName(String fullName) {
        this.fullName = fullName;
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

    public Doctor withId(int id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The speciality
     */
    public String getSpeciality() {
        return speciality;
    }

    /**
     * 
     * @param speciality
     *     The speciality
     */
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public Doctor withSpeciality(String speciality) {
        this.speciality = speciality;
        return this;
    }

}
