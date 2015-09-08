
package credihealth.app.com.credihealth.models.doctor;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Info {

    @Expose
    private String type;
    @Expose
    private List<String> cities = new ArrayList<String>();
    @Expose
    private List<String> hospitals = new ArrayList<String>();
    @Expose
    private List<String> genders = new ArrayList<String>();
    @Expose
    private List<String> specs = new ArrayList<String>();
    @SerializedName("hosp_count")
    @Expose
    private int hospCount;
    @SerializedName("doc_count")
    @Expose
    private int docCount;

    /**
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    public Info withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 
     * @return
     *     The cities
     */
    public List<String> getCities() {
        return cities;
    }

    /**
     * 
     * @param cities
     *     The cities
     */
    public void setCities(List<String> cities) {
        this.cities = cities;
    }

    public Info withCities(List<String> cities) {
        this.cities = cities;
        return this;
    }

    /**
     * 
     * @return
     *     The hospitals
     */
    public List<String> getHospitals() {
        return hospitals;
    }

    /**
     * 
     * @param hospitals
     *     The hospitals
     */
    public void setHospitals(List<String> hospitals) {
        this.hospitals = hospitals;
    }

    public Info withHospitals(List<String> hospitals) {
        this.hospitals = hospitals;
        return this;
    }

    /**
     * 
     * @return
     *     The genders
     */
    public List<String> getGenders() {
        return genders;
    }

    /**
     * 
     * @param genders
     *     The genders
     */
    public void setGenders(List<String> genders) {
        this.genders = genders;
    }

    public Info withGenders(List<String> genders) {
        this.genders = genders;
        return this;
    }

    /**
     * 
     * @return
     *     The specs
     */
    public List<String> getSpecs() {
        return specs;
    }

    /**
     * 
     * @param specs
     *     The specs
     */
    public void setSpecs(List<String> specs) {
        this.specs = specs;
    }

    public Info withSpecs(List<String> specs) {
        this.specs = specs;
        return this;
    }

    /**
     * 
     * @return
     *     The hospCount
     */
    public int getHospCount() {
        return hospCount;
    }

    /**
     * 
     * @param hospCount
     *     The hosp_count
     */
    public void setHospCount(int hospCount) {
        this.hospCount = hospCount;
    }

    public Info withHospCount(int hospCount) {
        this.hospCount = hospCount;
        return this;
    }

    /**
     * 
     * @return
     *     The docCount
     */
    public int getDocCount() {
        return docCount;
    }

    /**
     * 
     * @param docCount
     *     The doc_count
     */
    public void setDocCount(int docCount) {
        this.docCount = docCount;
    }

    public Info withDocCount(int docCount) {
        this.docCount = docCount;
        return this;
    }



}
