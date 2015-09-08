
package credihealth.app.com.credihealth.models.doctor;

import com.google.gson.annotations.Expose;

import java.util.ArrayList;
import java.util.List;

public class DoctorSearch {

    @Expose
    private List<Search> search = new ArrayList<Search>();
    @Expose
    private Info info;

    /**
     * 
     * @return
     *     The search
     */
    public List<Search> getSearch() {
        return search;
    }

    /**
     * 
     * @param search
     *     The search
     */
    public void setSearch(List<Search> search) {
        this.search = search;
    }

    public DoctorSearch withSearch(List<Search> search) {
        this.search = search;
        return this;
    }

    /**
     * 
     * @return
     *     The info
     */
    public Info getInfo() {
        return info;
    }

    /**
     * 
     * @param info
     *     The info
     */
    public void setInfo(Info info) {
        this.info = info;
    }

    public DoctorSearch withInfo(Info info) {
        this.info = info;
        return this;
    }



}
