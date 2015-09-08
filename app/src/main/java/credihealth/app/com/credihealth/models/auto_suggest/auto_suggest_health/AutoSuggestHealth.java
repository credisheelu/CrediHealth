
package credihealth.app.com.credihealth.models.auto_suggest.auto_suggest_health;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class AutoSuggestHealth {

    @Expose
    private List<Doctor> doctors = new ArrayList<Doctor>();
    @Expose
    private List<Hospital> hospitals = new ArrayList<Hospital>();
    @SerializedName("diagnostic_centres")
    @Expose
    private List<Object> diagnosticCentres = new ArrayList<Object>();
    @Expose
    private List<Speciality> specialities = new ArrayList<Speciality>();

    /**
     * 
     * @return
     *     The doctors
     */
    public List<Doctor> getDoctors() {
        return doctors;
    }

    /**
     * 
     * @param doctors
     *     The doctors
     */
    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    public AutoSuggestHealth withDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
        return this;
    }

    /**
     * 
     * @return
     *     The hospitals
     */
    public List<Hospital> getHospitals() {
        return hospitals;
    }

    /**
     * 
     * @param hospitals
     *     The hospitals
     */
    public void setHospitals(List<Hospital> hospitals) {
        this.hospitals = hospitals;
    }

    public AutoSuggestHealth withHospitals(List<Hospital> hospitals) {
        this.hospitals = hospitals;
        return this;
    }

    /**
     * 
     * @return
     *     The diagnosticCentres
     */
    public List<Object> getDiagnosticCentres() {
        return diagnosticCentres;
    }

    /**
     * 
     * @param diagnosticCentres
     *     The diagnostic_centres
     */
    public void setDiagnosticCentres(List<Object> diagnosticCentres) {
        this.diagnosticCentres = diagnosticCentres;
    }

    public AutoSuggestHealth withDiagnosticCentres(List<Object> diagnosticCentres) {
        this.diagnosticCentres = diagnosticCentres;
        return this;
    }

    /**
     * 
     * @return
     *     The specialities
     */
    public List<Speciality> getSpecialities() {
        return specialities;
    }

    /**
     * 
     * @param specialities
     *     The specialities
     */
    public void setSpecialities(List<Speciality> specialities) {
        this.specialities = specialities;
    }

    public AutoSuggestHealth withSpecialities(List<Speciality> specialities) {
        this.specialities = specialities;
        return this;
    }

}
